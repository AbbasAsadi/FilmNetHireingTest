package ir.filmNet.hiringTest.data;

import static ir.filmNet.hiringTest.data.Status.LOADING;
import static ir.filmNet.hiringTest.data.Status.SERVER_ERROR;
import static ir.filmNet.hiringTest.data.Status.SUCCESS;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


/**
 * @author Abbas Asadi
 * <p>
 * This wrapper class return from repository methods to viewmodel
 * and viewmodel pass this datawrapper to view ( Fragment,Activity , ... )
 */
@Keep
public class DataWrapper<T> {

    @NonNull
    public final Status status;
    @Nullable
    public final T data;
    @Nullable
    public final String message;


    private DataWrapper(@NonNull Status status,
                        @Nullable T data,
                        @Nullable String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }


    public static <T> DataWrapper<T> success(@NonNull T data) {
        return new DataWrapper<>(SUCCESS, data, null);
    }

    public static <T> DataWrapper<T> serverError(@NonNull String msg, @Nullable T data) {
        return new DataWrapper<>(SERVER_ERROR, data, msg);
    }

    public static <T> DataWrapper<T> loading() {
        return new DataWrapper<>(LOADING, null, null);
    }

}

