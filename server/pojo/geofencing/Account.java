package com.ballistic.server.pojo.geofencing;

import com.ballistic.server.pojo.common.ICommon;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;


@Document(collection = "account")
public class Account extends IDataModel {

    private String email;
    private String password;
    private String role; // admin, user
    private Set<ICommon.Scope> scopes;  // have only 2 scope
    private Boolean activated = false; // active after user e-mail confirm
    private String activationKey; // auto-gen
    private String resetPasswordKey; // auto-gen
    private String deleteKey; // auto-gen
    private Info info;
    private QrCode qrCode;
    private Set<Geofencing> accountGeofencings;
    private Set<AccountPinPoint> accountPinPoint; // durring create pin-point null

    public Account() { }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Set<ICommon.Scope> getScopes() { return scopes; }
    public void setScopes(Set<ICommon.Scope> scopes) { this.scopes = scopes; }

    public Boolean getActivated() { return activated; }
    public void setActivated(Boolean activated) { this.activated = activated; }

    public String getActivationKey() { return activationKey; }
    public void setActivationKey(String activationKey) { this.activationKey = activationKey; }

    public String getResetPasswordKey() { return resetPasswordKey; }
    public void setResetPasswordKey(String resetPasswordKey) { this.resetPasswordKey = resetPasswordKey; }

    public String getDeleteKey() { return deleteKey; }
    public void setDeleteKey(String deleteKey) { this.deleteKey = deleteKey; }

    public Info getInfo() { return info; }
    public void setInfo(Info info) { this.info = info; }

    public QrCode getQrCode() { return qrCode; }
    public void setQrCode(QrCode qrCode) { this.qrCode = qrCode; }

    public Set<Geofencing> getAccountGeofencings() { return accountGeofencings; }
    public void setAccountGeofencings(Set<Geofencing> accountGeofencings) { this.accountGeofencings = accountGeofencings; }

    public Set<AccountPinPoint> getAccountPinPoint() { return accountPinPoint; }
    public void setAccountPinPoint(Set<AccountPinPoint> accountPinPoint) { this.accountPinPoint = accountPinPoint; }

    public class Info {

        private String firstName;
        private String lastName;
        private FileInfo fileInfo;
        private Boolean gender; // type-check (male,fe-male)
        private String contactType; // type-check (tel-phone,mobile-phone)
        private String contactNumber;

        public Info() {}

        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }

        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }

        public FileInfo getImagePath() { return fileInfo; }
        public void setImagePath(FileInfo imagePath) { this.fileInfo = imagePath; }

        public Boolean getGender() { return gender; }
        public void setGender(Boolean gender) { this.gender = gender; }

        public String getContactType() { return contactType; }
        public void setContactType(String contactType) { this.contactType = contactType; }

        public String getContactNumber() { return contactNumber; }
        public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    }


}
