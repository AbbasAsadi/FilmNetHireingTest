package ir.filmNet.hiringTest.data;

import androidx.annotation.Keep;

/**
 * The enum Status.
 *
 * @author Abbas Asadi
 * The status of API response
 */
@Keep
public enum Status {
    /**
     * Success status.
     */
    SUCCESS,
    /**
     * Network Http Error status.
     */
    SERVER_ERROR,
    /**
     * Loading state.
     */
    LOADING,
}
