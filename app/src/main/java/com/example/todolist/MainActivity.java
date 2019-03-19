package com.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToDo menage = new ToDo("Faire le ménage", "20/03/2019");
        ToDo balade = new ToDo("Balader le chien", "24/03/2019");
        ToDo jardin = new ToDo("Tondre la pelouse", "25/03/2019");
        ToDo lessive = new ToDo("Faire la lessive", "25/03/2019");
        ToDo coder = new ToDo("Relire toutes les slides", "23/03/2019");

        List<ToDo> task = Arrays.asList(menage, balade, jardin, lessive, coder);

        ListView listTask = findViewById(R.id.listToDo);
        ToDoAdapter adapter = new ToDoAdapter(MainActivity.this, task);
        listTask.setAdapter(adapter);
    }
}
