package lk.ijse.dulanga.oralitdemo.dto;

public class UserDTO {
    private String email;
    private String mobileNO;

    public UserDTO() {
    }

    public UserDTO(String email, String mobileNO) {
        this.email = email;
        this.mobileNO = mobileNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(String mobileNO) {
        this.mobileNO = mobileNO;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "email='" + email + '\'' +
                ", mobileNO='" + mobileNO + '\'' +
                '}';
    }
}
