package model;

public class BankBranch {
    private String branchCode;
    private String branchName;
    private String location;

    public BankBranch(String branchCode, String branchName, String location) {
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.location = location;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBranchDetails() {
        return "Branch Code: " + branchCode
                + "\nBranch Name: " + branchName
                + "\nLocation: " + location;
    }
}
