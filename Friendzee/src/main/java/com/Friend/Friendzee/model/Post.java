
package com.Friend.Friendzee.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post { 
 private String id; 
 private String post;
 private String name; 
 private String email;
 private String image; 
 private String profilePic;
 private String timeStamp; 
 private String file;
 
 public String getId() {
	  return id; 
  }
  public void setId(String id) {  
	this.id=id;
  }
  
  public String getPost() {
	  return post; 
  }
  public void setPost(String post) {  
	 this.post = post;
  }
  
  public String getName() {
	  return name; 
  }
  public void setName(String name) {  
	 this.name = name;
  } 
  
  public String getEmail() {
	  return email;
  }
  public void setEmail(String email) {  
	 this.email = email;
  }
  
  public String getImage() {
	  return image;
  }
  public void setImage(String image) {  
	 this.image = image;
  } 
  
  public String getProfilePic() {
	  return profilePic; 
  }
  public void setProfilePic(String profilePic) {  
	 this.profilePic = profilePic;
  } 
  
  public String getTimeStamp() {
	  return timeStamp; 
  }
  public void setTimeStamp(String timeStamp) {  
	 this.timeStamp = timeStamp;
  }
  
  public String getFile() {
	  return file; 
  }
  public void setFile(String file) {  
	 this.file = file;
  }
 
  private Post(String post, String email, String name, String file, String profilePic, String timeStamp,String id, String image) {
	  this.post = post;         
      this.email = email;
      this.name = name;         
      this.file = file;
      this.profilePic = profilePic;         
      this.timeStamp = timeStamp;
      this.id=id;
      this.image=image;       
   }
  
   public static Builder builder() {         
	   return new Builder();
   }
 
   
public static class Builder {
	private String image;
	private String id;         
	private String post;
	private String email;         
    private String name;
    private String file;         
    private String profilePic;
    private String timeStamp;
    
    	   
    	   
    public Builder post(String post) {             
    	this.post = post;
    	return this;         
    }
    public Builder email(String email) {
    	 this.email = email;             
    	 return this;
    }
    public Builder name(String name) {             
    	 this.name = name;
    	 return this;         
    }
    public Builder file(String file) {
    	  this.file = file;             
    	  return this;
    }
    public Builder profilePic(String profilePic) {             
    	  this.profilePic = profilePic;
    	  return this;         
    }
    public Builder timeStamp(String timeStamp) {
    	   this.timeStamp = timeStamp;             
    	   return this;
    }
    public Post build() {
    	return new Post(post, email, name, file, profilePic, timeStamp, id, image);
    }
    public Builder id(String id1) {    
    	this.id = id1;
    	return this;   
    }
    public Builder image(String image1) {
    	this.image = image1;    
    	return this;
    }
  }	  
}