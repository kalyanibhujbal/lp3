
 // SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

contract MarksManagmtSys {

    struct Student {
        uint id;
        string fName;
        string lName;
        uint marks;
    }

    Student[] public stdRecords;

    address owner = msg.sender;

    modifier onlyOwner() {
        require(msg.sender == owner, "Only owner allowed");
        _;
    }

    function addNewRecords(
        uint id,
        string memory first,
        string memory last,
        uint marks
    ) public onlyOwner {
        stdRecords.push(Student(id, first, last, marks));
    }

    function viewMarks(uint index) public view returns (uint) {
        require(index < stdRecords.length, "Invalid student index");
        return stdRecords[index].marks;
    }

    function bonusMarks(uint index, uint bonus) public onlyOwner {
        require(index < stdRecords.length, "Invalid student index");
        stdRecords[index].marks += bonus;
    }

    // Search student using Student ID
    function searchStudentById(uint id)
        public view returns (uint, string memory, string memory, uint)
    {
        for (uint i = 0; i < stdRecords.length; i++) {
            if (stdRecords[i].id == id) {
                return (
                    stdRecords[i].id,
                    stdRecords[i].fName,
                    stdRecords[i].lName,
                    stdRecords[i].marks
                );
            }
        }

        revert("Student not found");
    }

    // Update student details using Student ID
    function updateStudent(
        uint id,
        string memory first,
        string memory last,
        uint marks
    ) public onlyOwner {

        for (uint i = 0; i < stdRecords.length; i++) {
            if (stdRecords[i].id == id) {

                stdRecords[i].fName = first;
                stdRecords[i].lName = last;
                stdRecords[i].marks = marks;

                return;
            }
        }

        revert("Student not found");
    }

    receive() external payable {}
    fallback() external payable {}
}
