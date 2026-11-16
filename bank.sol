
// SPDX-License-Identifier: MIT
// Specifies the license of the smart contract
pragma solidity ^0.8.34;
// Specifies the Solidity compiler version

// Defines a smart contract named SimpleBank
contract SimpleBank {

    // Stores the Ethereum address of the contract owner
    address public owner;

    // Stores the bank balance
    // uint256 is an unsigned integer (cannot store negative values)
    public uint256 balance;

    // Constructor executes only once when the contract is deployed
    constructor()
    {
        // Assigns the address of the person deploying the contract as owner
        // msg.sender represents the address of the person calling the contract
        owner = msg.sender;

        // Initializes the bank balance to zero
        balance = 0;
    }

    // Function to deposit money into the bank
    function deposit(uint256 amount) public {

        // Checks whether the caller is the owner
        // If not, displays the error message
        require(msg.sender == owner, "Only the owner can deposit money");

        // Adds the deposited amount to the existing balance
        balance += amount;
    }

    // Function to withdraw money from the bank
    function withdraw(uint256 amount) public {

        // Checks whether the caller is the owner
        require(msg.sender == owner, "Only the owner can withdraw money");

        // Checks whether the withdrawal amount is less than or equal to balance
        // If amount is greater than balance, displays an error
        require(amount <= balance, "Insufficient balance");

        // Subtracts the withdrawal amount from the existing balance
        balance -= amount;
    }

    // Function to display the current bank balance
    // view means this function only reads data and does not modify state
    function getBalance() public view returns (uint256) {

        // Returns the current bank balance
        return balance;
    }
}
