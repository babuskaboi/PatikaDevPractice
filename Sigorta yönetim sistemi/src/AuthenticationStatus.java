public enum AuthenticationStatus {
    SUCCESS(true),
    FAIL(false);

    boolean status;
    AuthenticationStatus(boolean status){
        this.status=status;
    }
      

    
}
