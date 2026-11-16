
// SPDX-License-Identifier: MIT
// Specifies the license of the smart contract

pragma solidity ^0.8.20;
// Specifies the Solidity compiler version

// Create a smart contract named MarksManagmtSys
contract MarksManagmtSys {

    // Define a structure to store student information
    struct Student {

        uint id;          // Stores student ID
        string fName;     // Stores student's first name
        string lName;     // Stores student's last name
        uint marks;       // Stores student's marks
    }

    // Create a public dynamic array to store student records
    Student[] public stdRecords;

    // Store the address of the person who deploys the contract
    address owner = msg.sender;

    // Create a modifier to restrict access to the contract owner
    modifier onlyOwner() {

        // Check whether the caller is the owner
        require(msg.sender == owner, "Only owner allowed");

        // Execute the function after the condition is satisfied
        _;
    }

    // Function to add a new student record
    // onlyOwner ensures that only the owner can add records
    function addNewRecords(
        uint id,              // Accept student ID
        string memory first,  // Accept student's first name
        string memory last,   // Accept student's last name
        uint marks            // Accept student's marks
    ) public onlyOwner {

        // Add a new student record to the array
        stdRecords.push(Student(id, first, last, marks));
    }

    // Function to view marks of a student using array index
    // view means this function does not modify contract data
    function viewMarks(uint index) public view returns (uint) {

        // Check whether the given index exists in the array
        require(index < stdRecords.length, "Invalid student index");

        // Return the marks of the student at the given index
        return stdRecords[index].marks;
    }

    // Function to add bonus marks to a student
    // onlyOwner restricts this function to the owner
    function bonusMarks(uint index, uint bonus) public onlyOwner {

        // Check whether the student index is valid
        require(index < stdRecords.length, "Invalid student index");

        // Add bonus marks to the existing marks
        stdRecords[index].marks += bonus;
    }

    // Search student using Student ID
    // This function returns student ID, first name, last name and marks
    function searchStudentById(uint id)
        public view returns (uint, string memory, string memory, uint)
    {

        // Loop through all student records in the array
        for (uint i = 0; i < stdRecords.length; i++) {

            // Check whether the current student's ID matches the given ID
            if (stdRecords[i].id == id) {

                // Return the details of the matching student
                return (
                    stdRecords[i].id,
                    stdRecords[i].fName,
                    stdRecords[i].lName,
                    stdRecords[i].marks
                );
            }
        }

        // If no matching student is found, display an error
        revert("Student not found");
    }

    // Update student details using Student ID
    // onlyOwner ensures that only the owner can update records
    function updateStudent(
        uint id,              // Accept student ID to search
        string memory first,  // Accept updated first name
        string memory last,   // Accept updated last name
        uint marks            // Accept updated marks
    ) public onlyOwner {

        // Loop through all student records
        for (uint i = 0; i < stdRecords.length; i++) {

            // Check whether the student ID matches
            if (stdRecords[i].id == id) {

                // Update the student's first name
                stdRecords[i].fName = first;

                // Update the student's last name
                stdRecords[i].lName = last;

                // Update the student's marks
                stdRecords[i].marks = marks;

                // Exit the function after updating the record
                return;
            }
        }

        // If the student ID is not found, display an error
        revert("Student not found");
    }

    // Special function that executes when the contract receives
    // Ether without any function call or calldata
    // payable allows the contract to receive Ether
    receive() external payable {}

    // Special function that executes when unknown function data
    // is sent to the contract; payable allows Ether to be received
    fallback() external payable {}
}
