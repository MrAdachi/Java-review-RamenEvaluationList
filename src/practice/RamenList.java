package practice;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RamenList {
	
	List<RamenItem> ramenItems;
	
	// コンストラクタ
	public RamenList() {
		// Listのインスタンス生成
		this.ramenItems = new ArrayList<RamenItem>();
	}
	
	// 登録
	public void addItem(String storeName, String prefecture, int score, String recommendMenu) {
		RamenItem ramenItem = new RamenItem(storeName, prefecture, score, recommendMenu);
		ramenItems.add(ramenItem);
	}
	
	// 変更
	public void changeItem(int index, String prefecture, int score, String recommendMenu) {
		RamenItem changeRamenItem = ramenItems.get(index);
		changeRamenItem.setPrefecture(prefecture);
		changeRamenItem.setScore(score);
		changeRamenItem.setRecommendMenu(recommendMenu);
		changeRamenItem.setUpdateTime();
	}
	
	// 削除
	public void removeItem(int index) {
		ramenItems.remove(index);
	}
	
	// 表示
	public void displayItem() {
		
		// ListのSort
		for(int i = 0; i < ramenItems.size() - 1; i++) {
			for(int j = 0; j < ramenItems.size() -1 - i; j++) {
				
				if(ramenItems.get(j).getScore() < ramenItems.get(j+1).getScore()) {
					
					RamenItem temporary = ramenItems.get(j);
					ramenItems.set(j, ramenItems.get(j+1));
					ramenItems.set(j+1, temporary);
				}
			}
		}
		
		int count = 0;
		
		for(RamenItem ramenItem : ramenItems) {
			// フォーマットの指定
			DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			System.out.println(count + "・・・　店舗名：" + ramenItem.getStoreName() + "　都道府県：" + ramenItem.getPrefecture() + "　評価点：" + ramenItem.getScore() + "点　おすすめメニュー：" + ramenItem.getRecommendMenu());
			System.out.println("　　　　 登録日時：" + ramenItem.getCreateTime().format(f) + "　更新日時：" + ramenItem.getUpdateTime().format(f));
			count ++;
		}
	}
}
