package service;

import dao.PhoneDAO;
import entity.Phone;

public class PhoneService {

    PhoneDAO phoneDAO = new PhoneDAO();
    public void addPhone(Phone phone) {
        phoneDAO.create(phone);
    }
}
