package app.ewtc.masterung.ungservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import app.ewtc.masterung.ungservice.MainActivity;
import app.ewtc.masterung.ungservice.R;

/**
 * Created by masterung on 28/10/2017 AD.
 */

public class RegisterFragment extends Fragment{

//    Explicit
    private String nameString, userString, passwordString;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

//        Save Controller
        saveController();

    }   // Main Method

    private void saveController() {
        ImageView imageView = getView().findViewById(R.id.imvSave);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//get value from edittext
                EditText nameEditText= getView().findViewById(R.id.edtName);
                EditText userEditTex = getView().findViewById(R.id.edtUser);
                EditText passwEditText = getView().findViewById(R.id.edtPassword);

                //chang type value to string
                nameString= nameEditText.getText().toString().trim();
                userString=userEditTex.getText().toString().trim();
                passwordString=userEditTex.getText().toString().trim();

                //check space
                if (nameString.equals("") ||userString.equals("")||passwordString.equals("")) {
                    //have space
                } else {
            //no space


                }

            }//onclick
        });
    }

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarRegister);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        ((MainActivity) getActivity()).setTitle(getResources().getString(R.string.new_register));

        ((MainActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_register,
                container, false);
        return view;
    }
}   // Main Class
