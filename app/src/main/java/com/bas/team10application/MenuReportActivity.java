package com.bas.team10application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bas.team10application.Service.DAO.ProjectDao;
import com.bas.team10application.Service.DAO.TestDAO;
import com.bas.team10application.Service.Service;

import java.util.ArrayList;

public class MenuReportActivity extends AppCompatActivity {
    private Button Report_testcase;
    private Button Report_Severity;
    private Button Report_Priority;
    private Button Report_TestSummary;
    private Button Report_DefectType;
    private Button Report_testcase_graph;
    private Button Report_Severity_graph;
    private Button Report_Priority_graph;
    private Button Report_TestSummary_graph;
    private Button Report_DefectType_graph;

    private Service service;
    private TestDAO testDAO;
    private ArrayList<TestDAO> mtestDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_report);

        //ตาราง
        Report_testcase = (Button) findViewById(R.id.Report_Table1);
        Report_Severity = (Button) findViewById(R.id.Report_Table2);
        Report_Priority = (Button) findViewById(R.id.Report_Table3);
        Report_TestSummary = (Button) findViewById(R.id.Report_Table4);
        Report_DefectType = (Button) findViewById(R.id.Report_Table5);
        //กราฟ
        Report_testcase_graph = (Button) findViewById(R.id.Report_graph1);
        Report_Severity_graph = (Button) findViewById(R.id.Report_graph2);
        Report_Priority_graph = (Button) findViewById(R.id.Report_graph3);
        Report_TestSummary_graph = (Button) findViewById(R.id.Report_graph4);
        Report_DefectType_graph = (Button) findViewById(R.id.Report_graph5);

        //ตาราง
        Report_testcase.setOnClickListener(onClickLoginListener1);
        Report_Severity.setOnClickListener(onClickLoginListener2);
        Report_Priority.setOnClickListener(onClickLoginListener3);
        Report_TestSummary.setOnClickListener(onClickLoginListener4);
        Report_DefectType.setOnClickListener(onClickLoginListener5);
        //กราฟ
        Report_testcase_graph.setOnClickListener(onClickLoginListener6);
        Report_Severity_graph.setOnClickListener(onClickLoginListener7);
        Report_Priority_graph.setOnClickListener(onClickLoginListener8);
        Report_TestSummary_graph.setOnClickListener(onClickLoginListener9);
        Report_DefectType_graph.setOnClickListener(onClickLoginListener10);
    }
    //1 ตารางที่ 1
    private View.OnClickListener onClickLoginListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Report_TestcaseActivity.class);

            startActivity(intent);
        }
    };

    //2 ตารางที่2
    private View.OnClickListener onClickLoginListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Report_SeverityActivity.class);

            startActivity(intent);
        }
    };
    //3 ตารางที่ 3
    private View.OnClickListener onClickLoginListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Report_PriorityActivity.class);

            startActivity(intent);
        }
    };
    //4 ตารางที่ 4
    private View.OnClickListener onClickLoginListener4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Report_TestSummaryActivity.class);

            startActivity(intent);
        }
    };
    //5 ตารางที่ 5
    private View.OnClickListener onClickLoginListener5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Report_DefectTypeActivity.class);

            startActivity(intent);
        }
    };

    //6 กราฟที่ 6
    private View.OnClickListener onClickLoginListener6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Report_Testcase_GraphActivity.class);

            intent.putExtra("data", mtestDAO);
            startActivity(intent);
        }
    };
    //7 กราฟที่ 7
    private View.OnClickListener onClickLoginListener7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Report_Severity_GraphActivity.class);

            startActivity(intent);
        }
    };
    //8 กราฟที่ 8
    private View.OnClickListener onClickLoginListener8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Report_Priority_GraphActivity.class);

            startActivity(intent);
        }
    };
    //9 กราฟที่ 9
    private View.OnClickListener onClickLoginListener9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Report_TestSummary_GraphActivity.class);

            startActivity(intent);
        }
    };
    //10 กราฟที่ 10
    private View.OnClickListener onClickLoginListener10 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Report_DefectType_GraphActivity.class);

            startActivity(intent);
        }
    };



}
