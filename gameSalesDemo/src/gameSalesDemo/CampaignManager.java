package gameSalesDemo;

public class CampaignManager implements CampaignService{
	public void add(Campaign campaign) {
		System.out.println("Eklendi : "+campaign.getType());
	}

	public void update(Campaign campaign) {
		System.out.println("Güncellendi : "+campaign.getType());
	}
	public void delete(Campaign campaign) {
		System.out.println("Silindi : "+campaign.getType());
	}
}
