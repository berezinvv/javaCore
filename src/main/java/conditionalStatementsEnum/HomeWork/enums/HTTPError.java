package conditionalStatementsEnum.HomeWork.enums;

public enum HTTPError {
    error400("Bad Request"),
    error401("Unauthorized"),
    error402("Payment Required"),
    error403("Forbidden"),
    error404("Not Found"),
    error405("Method Not Allowed"),
    error406("Not Acceptable"),
    error407("Proxy Authentication Required"),
    error408("Request Timeout"),
    error409("Conflict"),
    error410("Gone"),
    error411("Length Required"),
    error412("Precondition Failed"),
    error413("Payload Too Large"),
    error414("URI Too Long"),
    error415("Unsupported Media Type"),
    error416("Range Not Satisfiable"),
    error417("Expectation Failed"),
    error418("I’m a teapot"),
    error421("Misdirected Request"),
    error422("Unprocessable Entity"),
    error423("Locked"),
    error424("Failed Dependency"),
    error426("Upgrade Required"),
    error428("Precondition Required"),
    error429("Too Many Requests"),
    error431("Request Header Fields Too Large"),
    error449("Retry With"),
    error451("Unavailable For Legal Reasons");

    String nameError;

    HTTPError(String nameError) {
        this.nameError = nameError;
    }

    public String getNameError() {
        return nameError;
    }
}
