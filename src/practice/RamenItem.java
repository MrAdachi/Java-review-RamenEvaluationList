package practice;

public class RamenItem {
	
	// インスタンス変数の定義
	private String store_name;
	private String prefecture;
	private int score;
	private String recommend_menu;
	
	// コンストラクタ
	public RamenItem(String store_name, String prefecture, int score, String recommend_menu) {
		// 評価情報の登録
		this.store_name = store_name;
		this.prefecture = prefecture;
		this.score = score;
		this.recommend_menu = recommend_menu;
	}
	
	// 情報更新
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void setRecommend_menu(String recommend_menu) {
		this.recommend_menu = recommend_menu;
	}
	
	// 情報取得
	public String getStoreName() {
		return store_name;
	}
	
	public String getPrefecture() {
		return prefecture;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getRecommend_menu() {
		return recommend_menu;
	}
}
