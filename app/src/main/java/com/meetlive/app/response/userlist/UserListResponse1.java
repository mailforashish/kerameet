package com.meetlive.app.response.userlist;

import java.io.Serializable;
import java.util.List;

public class UserListResponse1 implements Serializable {
    boolean success;
    Result result;
    String error;

    public boolean isSuccess() {
        return success;
    }

    public Result getResult() {
        return result;
    }

    public String getError() {
        return error;
    }


    public void setResult(Result result) {
        this.result = result;
    }

    public static class Result implements Serializable {
        List<Data> data;
        int current_page, from, last_page, per_page, to, total;
        String last_page_url, first_page_url, path, next_page_url, prev_page_url;

        public List<Data> getData() {
            return data;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public int getFrom() {
            return from;
        }

        public int getLast_page() {
            return last_page;
        }

        public int getPer_page() {
            return per_page;
        }

        public int getTo() {
            return to;
        }

        public int getTotal() {
            return total;
        }

        public String getLast_page_url() {
            return last_page_url;
        }

        public String getFirst_page_url() {
            return first_page_url;
        }

        public String getPath() {
            return path;
        }

        public String getNext_page_url() {
            return next_page_url;
        }

        public String getPrev_page_url() {
            return prev_page_url;
        }
    }

    public static class Data implements Serializable {
        int id, favorite_count, favorite_by_you_count, profile_id, call_rate, is_online, is_busy;
        String name, username, dob, about_user, city, login_type, firebase_status;
        List<UserPics> profile_images;
        //   List<Object> profile_video;
        long mobile;

        public String getFirebase_status() {
            return firebase_status;
        }

        public void setFirebase_status(String firebase_status) {
            this.firebase_status = firebase_status;
        }

        public String getLogin_type() {
            return login_type;
        }

        public int getIs_busy() {
            return is_busy;
        }

        public String getCity() {
            return city;
        }

        public long getMobile() {
            return mobile;
        }

        public int getCall_rate() {
            return call_rate;
        }

        public int getIs_online() {
            return is_online;
        }

        public String getDob() {
            return dob;
        }

        public String getAbout_user() {
            return about_user;
        }

        public int getId() {
            return id;
        }

        public int getFavorite_count() {
            return favorite_count;
        }

        public int getFavorite_by_you_count() {
            return favorite_by_you_count;
        }

        public String getName() {
            return name;
        }

        public String getUsername() {
            return username;
        }

        public int getProfile_id() {
            return profile_id;
        }

        public List<UserPics> getProfile_images() {
            return profile_images;
        }

        /////////////

        public void setId(int id) {
            this.id = id;
        }

        public void setFavorite_count(int favorite_count) {
            this.favorite_count = favorite_count;
        }

        public void setFavorite_by_you_count(int favorite_by_you_count) {
            this.favorite_by_you_count = favorite_by_you_count;
        }

        public void setProfile_id(int profile_id) {
            this.profile_id = profile_id;
        }

        public void setCall_rate(int call_rate) {
            this.call_rate = call_rate;
        }

        public void setIs_online(int is_online) {
            this.is_online = is_online;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public void setAbout_user(String about_user) {
            this.about_user = about_user;
        }

        public void setProfile_images(List<UserPics> profile_images) {
            this.profile_images = profile_images;
        }

        public void setMobile(long mobile) {
            this.mobile = mobile;
        }
    }

    public static class UserPics implements Serializable {
        int id, user_id, is_profile_image;
        String image_name, image_type, created_at, updated_at;

        public int getId() {
            return id;
        }

        public int getUser_id() {
            return user_id;
        }

        public int getIs_profile_image() {
            return is_profile_image;
        }

        public String getImage_name() {
            return image_name;
        }

        public String getImage_type() {
            return image_type;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        /////////////

        public void setId(int id) {
            this.id = id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public void setIs_profile_image(int is_profile_image) {
            this.is_profile_image = is_profile_image;
        }

        public void setImage_name(String image_name) {
            this.image_name = image_name;
        }

        public void setImage_type(String image_type) {
            this.image_type = image_type;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }


    }
}
