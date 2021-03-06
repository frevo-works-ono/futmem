package com.futmem.domain.dto;

import org.springframework.security.core.authority.AuthorityUtils;

import com.futmem.domain.model.User;

public class LoginUser extends org.springframework.security.core.userdetails.User {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private int userId;

  private String userName;

  /*
   * コンストラクタ
   * 
   * @param user
   */
  public LoginUser(User user) {
    // スーパークラスのユーザーID、パスワードに値をセットする
    // 実際の認証はスーパークラスのユーザーID、パスワードで行われる
    super(user.getMailaddress(), user.getPassword(),
        AuthorityUtils.createAuthorityList("ROLE_USER"));
    this.userId = user.getUserId();
    this.userName = user.getUserName();
  }
}
