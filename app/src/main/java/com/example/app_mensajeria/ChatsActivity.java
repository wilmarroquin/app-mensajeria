package com.example.app_mensajeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ChatsActivity extends AppCompatActivity {
    private LinearLayout btnGrupos, btnChats, btnInvitacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);

        btnGrupos = findViewById(R.id.btnGrupos);
        btnChats = findViewById(R.id.btnChats);
        btnInvitacion = findViewById(R.id.btnInvitacion);

        // Redirigir a la pantalla de Grupos
        btnGrupos.setOnClickListener(v -> {
            Intent intent = new Intent(ChatsActivity.this, GruposActivity.class);
            startActivity(intent);
            seleccionarBoton(btnGrupos);
        });

        // Redirigir a la pantalla de Chats
        btnChats.setOnClickListener(v -> {
            Intent intent = new Intent(ChatsActivity.this, ChatsActivity.class);
            startActivity(intent);
            seleccionarBoton(btnChats);
        });

        // Redirigir a la pantalla de Invitación
        btnInvitacion.setOnClickListener(v -> {
            Intent intent = new Intent(ChatsActivity.this, InvitacionActivity.class);
            startActivity(intent);
            seleccionarBoton(btnInvitacion);
        });
    }

    // Seleccion de boton
    private void seleccionarBoton(LinearLayout botonSeleccionado) {
        btnGrupos.setBackgroundColor(getResources().getColor(R.color.purple_500));
        btnChats.setBackgroundColor(getResources().getColor(R.color.purple_500));
        btnInvitacion.setBackgroundColor(getResources().getColor(R.color.purple_500));
        botonSeleccionado.setBackgroundColor(getResources().getColor(R.color.purple_700));
    }
}
