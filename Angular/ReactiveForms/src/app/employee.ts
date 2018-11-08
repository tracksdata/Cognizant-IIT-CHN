export class Employee {
    empId:number;
    empName:string;
    salary:number;

    getEmpId():number{

        return this.empId;
    }
    getEmpName():string{
        return this.empName;
    }

    getSalary():number{
        return this.salary;
    }
}
