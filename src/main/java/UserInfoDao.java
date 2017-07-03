import com.google.gson.annotations.SerializedName;

public class UserInfoDao {
    @SerializedName("login")
    private String login;
    @SerializedName("id")
    private Long id;
    @SerializedName("url")
    private String url;
    @SerializedName("site_admin")
    private Boolean siteAdmin;
    @SerializedName("email")
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfoDao userInfoDao = (UserInfoDao) o;

        if (login != null ? !login.equals(userInfoDao.login) : userInfoDao.login != null) return false;
        if (id != null ? !id.equals(userInfoDao.id) : userInfoDao.id != null) return false;
        if (url != null ? !url.equals(userInfoDao.url) : userInfoDao.url != null) return false;
        if (siteAdmin != null ? !siteAdmin.equals(userInfoDao.siteAdmin) : userInfoDao.siteAdmin != null) return false;
        return email != null ? email.equals(userInfoDao.email) : userInfoDao.email == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (siteAdmin != null ? siteAdmin.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserInfoDao{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", url='" + url + '\'' +
                ", siteAdmin=" + siteAdmin +
                ", email='" + email + '\'' +
                '}';
    }
}
