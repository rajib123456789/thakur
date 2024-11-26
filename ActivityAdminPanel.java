package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityAdminPanel extends AppCompatActivity {

     Button btnManageDoctors, btnManagePatients, btnManageBuyMedicine, btnManageLabTests, btnManageHealthArticles, btnManageOrderDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);

        btnManageDoctors = findViewById(R.id.btn_manage_doctors);
        btnManagePatients = findViewById(R.id.btn_manage_patients);
        btnManageBuyMedicine = findViewById(R.id.btn_manage_buy_medicine);
        btnManageLabTests = findViewById(R.id.btn_manage_lab_tests);
        btnManageHealthArticles = findViewById(R.id.btn_manage_health_articles);
        btnManageOrderDetails = findViewById(R.id.btn_manage_order_details);

        btnManageDoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to manage doctors activity
                startActivity(new Intent(ActivityAdminPanel.this, ManageDoctorsActivity.class));
            }
        });

        btnManagePatients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to manage patients activity
                startActivity(new Intent(ActivityAdminPanel.this, ManagePatientsActivity.class));
            }
        });

        btnManageBuyMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to manage buy medicine activity
                startActivity(new Intent(ActivityAdminPanel.this, BuyMedicineActivity.class));
            }
        });

        btnManageLabTests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to manage lab tests activity
                startActivity(new Intent(ActivityAdminPanel.this, LabTestActivity.class));
            }
        });

        btnManageHealthArticles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to manage health articles activity
                startActivity(new Intent(ActivityAdminPanel.this, HealthArticlesActivity.class));
            }
        });

        btnManageOrderDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to manage order details activity
                startActivity(new Intent(ActivityAdminPanel.this, OrderDetailsActivity.class));
            }
        });
    }
}