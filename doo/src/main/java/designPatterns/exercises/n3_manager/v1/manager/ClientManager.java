package designPatterns.exercises.n3_manager.v1.manager;

import designPatterns.exercises.n3_manager.v1.store.StoreProxy;

public class ClientManager extends Manager {

	@Override
	protected Store createStore() {
		return new StoreProxy();
	}
	
	@Override
	public void manage() {
		super.manage();
		((StoreProxy) store).close();
	}
	
	public static void main(String[] args) {
		new ClientManager().manage();
	}

}
