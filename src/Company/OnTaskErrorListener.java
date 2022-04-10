package Company;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError (String errorCallback);
}
