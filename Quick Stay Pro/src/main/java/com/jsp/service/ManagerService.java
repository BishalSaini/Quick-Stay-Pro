package com.jsp.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.jsp.dao.HistoryDao;
import com.jsp.dao.HotelDao;
import com.jsp.dao.ManagerDao;
import com.jsp.dao.OwnerDao;
import com.jsp.dao.RoomDao;
import com.jsp.dao.UserDao;
import com.jsp.dto.History;
import com.jsp.dto.Manager;
import com.jsp.dto.Owner;
import com.jsp.dto.Room;
import com.jsp.dto.User;

public class ManagerService {
	Manager manager = new Manager();
	ManagerDao managerDao = new ManagerDao();
	UserDao userDao = new UserDao();
	OwnerDao ownerDao = new OwnerDao();
	RoomDao roomDao = new RoomDao();
	HistoryDao historyDao = new HistoryDao();
	History history = new History();
	HotelDao hotelDao = new HotelDao();

	public Manager saveManagerDetails(Manager manager) {
		manager.setStatus("unauthorised");
		return managerDao.saveManagerDetails(manager);
	}

	public Manager deleteManagerById(int id) {
		if (manager != null) {
			return managerDao.deleteManagerById(id);
		} else {
			return null;
		}
	}

	public Manager updateManagerEmailById(int id, String username, String password) {
		if (manager != null) {
			return managerDao.updateManagerById(id, username, password);
		} else {
			return null;
		}
	}

	public Manager getMangerDetailsById(int id) {
		return managerDao.getManagerDetailsById(id);
	}

	public List<Manager> getAllManagerDetails() {
		return managerDao.getAllManagerDetails();
	}

	public boolean managerLogin(int id, String username, String password) {
		Manager manager = managerDao.getManagerDetailsById(id);
		if (manager.getUsername().equals(username) && manager.getPassword().equals(password)
				&& manager.getStatus().equalsIgnoreCase("authorized")) {

			managerDao.saveManagerDetails(manager);
			return true;
		} else {
			return false;
		}
	}

	public boolean approveOwnerById(int oid, int mid) {
		Owner owner = ownerDao.getOwnerById(oid);
		Manager manager = managerDao.getManagerDetailsById(mid);
		if (owner != null && manager != null) {
			owner.setStatus("Authorized");
			owner.setManager(manager);
			owner.setApproval_Date(LocalDate.now());
			return ownerDao.approveOwner(owner);

		}
		return false;
	}

	public boolean rejectOwnerById(int oid, int mid) {
		Owner owner = ownerDao.getOwnerById(oid);
		Manager manger = managerDao.getManagerDetailsById(mid);
		if (owner != null && manager != null) {
			owner.setStatus("Rejected");
			owner.setManager(manger);
			return ownerDao.approveOwner(owner);

		}

		return false;
	}

}
