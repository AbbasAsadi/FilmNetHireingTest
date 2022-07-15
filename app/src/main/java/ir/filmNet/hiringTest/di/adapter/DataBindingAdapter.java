package ir.filmNet.hiringTest.di.adapter;

import static androidx.core.text.HtmlCompat.FROM_HTML_MODE_COMPACT;

import android.os.Build;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;

import ir.filmNet.hiringTest.R;

public class DataBindingAdapter {
    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String url) {
        Picasso.get().load(url).placeholder(R.drawable.placeholder_image).into(view);
    }

    @BindingAdapter(value = {"visible_invisible"})
    public static void visibleInvisible(View view, boolean isVisible) {
        view.setVisibility(isVisible ? View.VISIBLE : View.INVISIBLE);
    }

    @BindingAdapter(value = {"visible_gone"})
    public static void visibleGone(View view, boolean isVisible) {
        view.setVisibility(isVisible ? View.VISIBLE : View.GONE);
    }

    @BindingAdapter(value = {"html_text"})
    public static void htmlText(View view, String htmlText) {
        TextView textView = (TextView) view;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(htmlText, FROM_HTML_MODE_COMPACT));
        } else
            textView.setText(Html.fromHtml(htmlText));
    }

}
