package content;

public class customer extends person implements member {
    public String tipemember;

    public String getTipemember() {
        return tipemember;
    }

    public void setTipemember(String tipemember) {
        this.tipemember = tipemember;
    }

    public String member[][] = {
            { "CJ", "Sweet", "Johnson " },
            { "Premium", "Gold", "Silver" }
    };

    public boolean ismember() {
        for (int i = 0; i < member.length; i++) {
            if (getNama().equals(member[0][i])) {
                this.tipemember = member[1][i];
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    @Override
    public double getdiskonmember() {
        if (tipemember == "Premium") {
            return premium;
        } else if (tipemember == "Gold") {
            return gold;
        } else if (tipemember == "Silver") {
            return silver;
        } else {
            System.out.println("Kon guduk member");
        }
        return 0;
    }
}
