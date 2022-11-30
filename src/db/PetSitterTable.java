package db;

import java.util.Hashtable;

import pd.systemuser.PetSitter;

/*
 * PetSitterDM으로 불러온 PetSitter Hashtable을 불러와서 보관하는 고유한 싱글톤 클래스.
 * PetSitterTable petsittertable = PetSitterTable.getInstance() 형태로 불러오면 어디서든 같은 내용의 PetSitterTable 사용가능.
 */
public class PetSitterTable
{
    private static PetSitterTable petsittertable;
    private static Hashtable<String, PetSitter> petsitterhashtable;
    private PetSitterDM petsitterDM;
    
    private PetSitterTable() {
    	petsitterDM = new PetSitterDM("PetSitterDM");
    }
    
    public static PetSitterTable getInstance()
    {
        if (petsittertable == null)
        {
            synchronized(PetSitterTable.class)
            {
                petsittertable = new PetSitterTable();
            }
        }
        return petsittertable;
    }

    //getter
	public Hashtable<String, PetSitter> getPetSitterHashTable() {
		petsitterhashtable = petsitterDM.readObjectData();
		return petsitterhashtable;
	}

	//돌봄이 추가
	public void putPetSitterHashTable(String petsitterID, PetSitter petsitter) {
		petsitterhashtable = petsitterDM.readObjectData();
		if(petsitterhashtable == null)
			petsitterhashtable = new Hashtable<>();
		petsitterhashtable.put(petsitterID, petsitter);
		petsitterDM.deletObjectData();
		petsitterDM.writeObjectData(petsitterhashtable);
	}

}