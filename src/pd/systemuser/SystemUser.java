package pd.systemuser;

import db.SystemUserData;

public class SystemUser {
    // 개인 정보
    protected String name;                  // 이름
    protected String birth;                 // 생년월일
    protected int age;                      // 나이
    protected String address;               // 주소
    protected String cellPhoneContact;      // 연락처
    protected String email;                 // 이메일

    // 로그인 정보
    protected String loginID;               // 로그인 ID
    protected String password;              // 로그인 비밀번호

    protected String userID;                // 회원 ID

    // init
    public SystemUser(SystemUserData systemUserData){
        setName(systemUserData.getName());
        setBirth(systemUserData.getBirth());
        setAge(systemUserData.getAge());
        setAddress(systemUserData.getAddress());
        setCellPhoneContact(systemUserData.getCellPhoneContact());
        setEmail(systemUserData.getEmail());
        setLoginID(systemUserData.getLoginID());
        setPassword(systemUserData.getPassword());
        setID(systemUserData.getUserID());
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCellPhoneContact(String cellPhoneContact) {
        this.cellPhoneContact = cellPhoneContact;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setID(String  ID) {
        this.userID = ID;
    }

    // getter
    public String getUserID() {
        return userID;
    }
}
