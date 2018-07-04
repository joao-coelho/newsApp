package newsapp.services.data;

import java.util.List;

public class UserDetails {

    private String username;
    private String password;
    private String name;
    private int age;
    private String email;
    private String country;
    private List<String> types;
    private boolean createChannel;
    private String channelName;
    private String channelDescription;

    public String getChannelIcon() {
        return channelIcon;
    }

    public void setChannelIcon(String channelIcon) {
        this.channelIcon = channelIcon;
    }

    private String channelIcon;
    private List<String> channelTypes;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public boolean wantsChannel() {
        return createChannel;
    }

    public void setCreateChannel(boolean createChannel) {
        this.createChannel = createChannel;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelDescription() {
        return channelDescription;
    }

    public void setChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription;
    }

    public List<String> getChannelTypes() {
        return channelTypes;
    }

    public void setChannelTypes(List<String> channelTypes) {
        this.channelTypes = channelTypes;
    }
}
