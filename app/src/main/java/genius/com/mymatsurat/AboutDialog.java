package genius.com.mymatsurat;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatDialogFragment;

/**
 * Created by Haydar Dzaky S on 5/9/2018.
 */

public class AboutDialog extends AppCompatDialogFragment {

    private String message = "(c) 2018 UBK Plus Developer All Rights Reserved";
    private String title = "About";

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                    }
                });

        return builder.create();
    }
}
