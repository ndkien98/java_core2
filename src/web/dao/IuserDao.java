package web.dao;

import web.model.UserModel;

public interface IuserDao extends IGenericDao<UserModel> {

    UserModel findByUserNamePassWord();


}
