package com.example.high_tech_shop.user;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.high_tech_shop.R;
import com.example.high_tech_shop.entity.User;
import com.example.high_tech_shop.repositories.UserRepository;

public class ProfileActivity extends AppCompatActivity {
    private ConstraintLayout address;
    TextView tvFullName,tvEmail, tvPhone, tvDataOfBirth;
    Button btnEditProfile, btnBack;
    UserRepository userRepository;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        address = findViewById(R.id.address);

        tvFullName = findViewById(R.id.tvUserName);
        tvEmail = findViewById(R.id.textView18);
        tvPhone = findViewById(R.id.tvPhoneContent);
        tvDataOfBirth = findViewById(R.id.tvDoBContent);
        btnEditProfile = findViewById(R.id.btnEdit);
        btnBack = findViewById(R.id.btnBack);

        userRepository = new UserRepository(this);

        Intent intent = getIntent();
        final User user = (User) intent.getSerializableExtra("user");

        assert user != null;
        tvFullName.setText(user.getFullName());
        tvEmail.setText(user.getEmail());
        tvPhone.setText(user.getPhone());
        tvDataOfBirth.setText(user.getDob());

        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, AddressActivity.class);
                intent.putExtra("user", user);
                startActivity(intent);
                finish();
            }
        });
        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(ProfileActivity.this);
                dialog.setContentView(R.layout.activity_update_profile_user);
                Intent intent = getIntent();
                User user1 = (User) intent.getSerializableExtra("user");

                EditText etFullName , etPhone, etDob;
                TextView tvEmail;
                Button btnUpdate, btnExit;

                etFullName = dialog.findViewById(R.id.editTextText);
                tvEmail = dialog.findViewById(R.id.editTextText2);
                etPhone = dialog.findViewById(R.id.editTextText3);
                etDob = dialog.findViewById(R.id.editTextDate);
                btnUpdate = dialog.findViewById(R.id.button);
                btnExit = dialog.findViewById(R.id.button2);

                assert user != null;
                etFullName.setText(user.getFullName());
                tvEmail.setText(user.getEmail());
                etPhone.setText(user.getPhone());
                etDob.setText(user.getDob());

                btnUpdate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(etFullName.getText().toString().isEmpty()||
                                tvEmail.getText().toString().isEmpty()||
                                etPhone.getText().toString().isEmpty()||
                                etDob.getText().toString().isEmpty()) dialog.dismiss();
                        user1.setFullName(etFullName.getText().toString());
                        user1.setEmail(tvEmail.getText().toString());
                        user1.setPhone(etPhone.getText().toString());
                        user1.setDob(etDob.getText().toString());
                        userRepository.update(user1);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                tvFullName.setText(user.getFullName());
                                tvEmail.setText(user.getEmail());
                                tvPhone.setText(user.getPhone());
                                tvDataOfBirth.setText(user.getDob());
                            }
                        });

                        dialog.dismiss();
                    }
                });
                btnExit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, HomePageActivity.class);

                intent.putExtra("returnFromProfileUpdate", true);

                User userUpdated = userRepository.findByEmail(user.getEmail());

                intent.putExtra("user", userUpdated);

                setResult(RESULT_OK, intent);

                finish();
            }
        });

    }
}