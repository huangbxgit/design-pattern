package hbx.dispatch;

import java.util.HashMap;
import java.util.Map;

/**
 * 旅行社
 */
public class TravelHome {
    private Map<String,TravelAgency> travelsMap;
    public TravelHome(){
        travelsMap = new HashMap<String,TravelAgency>();
        travelsMap.put("北京",new BeiJing());
        travelsMap.put("上海",new ShangHai());
        travelsMap.put("福州",new Fuzhou());
    }
    public void dispatch(String name){
        if(travelsMap.containsKey(name)){
            travelsMap.get(name).getRoad();
        }else{
            System.out.println("没有此旅行线路");
        }
    }
}
