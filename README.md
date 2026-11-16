ORAL VIVA QUESTIONS AND ANSWERS ML (MACHINE LEARNING), BLT (BLOCKCHAIN
TECHNOLOGY), AND DAA Simple-English Practical and Oral Exam Preparation

============================================================ SECTION 1:
MACHINE LEARNING (ML)
============================================================

A. MACHINE LEARNING BASICS

1.  What is Machine Learning? Answer: Machine Learning is a branch of
    Artificial Intelligence that allows computers to learn patterns from
    data and make predictions or decisions without being explicitly
    programmed for every task.

2.  What is Artificial Intelligence? Answer: Artificial Intelligence
    (AI) is the ability of machines to perform tasks that normally
    require human intelligence, such as learning, reasoning, and
    problem-solving.

3.  What is the difference between AI and ML? Answer: AI is the broader
    field of making machines intelligent. Machine Learning is a part of
    AI in which machines learn from data.

4.  What are the main types of Machine Learning? Answer:

-   Supervised Learning: Learns from labelled data.
-   Unsupervised Learning: Finds patterns in unlabelled data.
-   Reinforcement Learning: Learns by receiving rewards or penalties for
    actions.

5.  What is supervised learning? Answer: Supervised learning uses input
    data along with known output labels to train a model.

6.  What is unsupervised learning? Answer: Unsupervised learning uses
    data without output labels and discovers hidden patterns or groups.

7.  What is a dataset? Answer: A dataset is a collection of data
    arranged in rows and columns.

8.  What are features? Answer: Features are the input variables used by
    a machine learning model to make predictions.

9.  What is a target variable? Answer: The target is the output variable
    that the model tries to predict.

10. What is training data? Answer: Training data is the part of the
    dataset used to teach the model.

11. What is testing data? Answer: Testing data is unseen data used to
    evaluate how well the trained model performs.

12. Why do we split data into training and testing sets? Answer: We
    split data to train the model on one portion and check its
    performance on unseen data. This helps estimate how well it may work
    on new data.

13. What is overfitting? Answer: Overfitting occurs when a model learns
    the training data too closely, including noise, and performs poorly
    on new data.

14. What is underfitting? Answer: Underfitting occurs when a model is
    too simple to learn the important patterns in the data.

15. What is data preprocessing? Answer: Data preprocessing means
    cleaning and preparing raw data before giving it to a machine
    learning model.

16. Why do we handle missing values? Answer: Missing values can affect
    calculations and model training. We may remove them or replace them
    using a suitable method.

17. What is an outlier? Answer: An outlier is a value that is unusually
    high or low compared with most other values in the dataset.

18. What is the IQR method? Answer: IQR means Interquartile Range. It is
    calculated as Q3 minus Q1. A common rule identifies values below
    Q1 - 1.5 times IQR or above Q3 + 1.5 times IQR as outliers.

19. What is feature scaling? Answer: Feature scaling brings numerical
    features to comparable ranges so that large-valued features do not
    dominate distance-based algorithms.

20. What is StandardScaler? Answer: StandardScaler transforms features
    so that they have approximately mean 0 and standard deviation 1,
    based on the training data.

21. What is a pipeline in machine learning? Answer: A pipeline combines
    preprocessing steps and a machine learning model into one sequence.

22. What is random_state? Answer: random_state fixes the random process
    so that results such as data splitting can be reproduced.

23. What is stratify in train_test_split? Answer: stratify maintains
    approximately the same class proportions in training and testing
    sets.

24. What is classification? Answer: Classification predicts a category
    or class, such as spam or not spam.

25. What is regression? Answer: Regression predicts a continuous
    numerical value, such as a house price or taxi fare.

B. KNN ALGORITHM

26. What is KNN? Answer: K-Nearest Neighbors is a supervised learning
    algorithm used for classification and regression. It makes a
    prediction using the nearest data points.

27. How does KNN work? Answer:

-   Choose the value of K.
-   Calculate the distance between the new point and training points.
-   Select the K nearest points.
-   For classification, choose the majority class among those neighbors.

28. What does K represent in KNN? Answer: K represents the number of
    nearest neighbors considered for prediction.

29. What is Euclidean distance? Answer: Euclidean distance is the
    straight-line distance between two points. For two dimensions, it is
    the square root of the sum of squared coordinate differences.

30. Why is feature scaling important for KNN? Answer: KNN uses distance
    calculations. A feature with a large numerical range could dominate
    the distance if features are not scaled.

31. What happens if K is too small? Answer: The model may become
    sensitive to noise and overfit.

32. What happens if K is too large? Answer: The model may become too
    smooth and underfit.

33. Is KNN supervised or unsupervised? Answer: KNN is a supervised
    learning algorithm.

C. SUPPORT VECTOR MACHINE (SVM)

34. What is SVM? Answer: Support Vector Machine is a supervised learning
    algorithm that finds a decision boundary to separate classes.

35. What is a hyperplane? Answer: A hyperplane is the decision boundary
    used by SVM to separate different classes.

36. What are support vectors? Answer: Support vectors are the training
    data points closest to the decision boundary. They help determine
    the boundary.

37. What is the margin in SVM? Answer: The margin is the distance
    between the decision boundary and the closest data points from each
    class. SVM tries to maximize this margin.

38. What is LinearSVC? Answer: LinearSVC is an implementation of a
    linear Support Vector Classifier in scikit-learn.

39. What does parameter C do in LinearSVC? Answer: C controls the
    penalty for classification errors. A larger C penalizes errors more
    strongly and may produce a narrower margin.

D. EMAIL SPAM DETECTION PROJECT

40. What is the aim of the Email Spam Detection project? Answer: The aim
    is to classify emails into Spam and Not Spam categories using
    machine learning.

41. Which algorithms are used in your email spam project? Answer:
    K-Nearest Neighbors (KNN) and Support Vector Machine (SVM).

42. What is the target column in the email dataset? Answer: The target
    column is Prediction. In this dataset, 0 represents Not Spam and 1
    represents Spam.

43. Why is the Email No. column removed? Answer: It is an identifier and
    normally does not provide useful information for predicting whether
    an email is spam.

44. What is a sparse matrix? Answer: A sparse matrix contains many zero
    values. It stores non-zero values efficiently to reduce memory
    usage.

45. What is TF-IDF? Answer: TF-IDF stands for Term Frequency-Inverse
    Document Frequency. It gives importance to a feature based on its
    frequency and how informative it is.

46. Why is TfidfTransformer used in the email project? Answer: It
    transforms the existing numerical feature values into
    TF-IDF-weighted values. It does not convert raw email text into
    features.

47. What is the difference between TfidfVectorizer and TfidfTransformer?
    Answer: TfidfVectorizer converts raw text into TF-IDF features.
    TfidfTransformer takes an already numerical feature matrix, such as
    term counts, and applies TF-IDF weighting.

48. Why are both KNN and SVM compared? Answer: To check which algorithm
    performs better on the same dataset using evaluation metrics.

E. DIABETES PREDICTION PROJECT

49. What is the aim of the Diabetes Prediction project? Answer: The aim
    is to predict whether a person belongs to the diabetes or
    non-diabetes class using health-related input features.

50. Which algorithm is used in the diabetes project? Answer: K-Nearest
    Neighbors (KNN) classification.

51. What is the target column? Answer: The target column is Outcome. 0
    represents the non-diabetes class and 1 represents the diabetes
    class.

52. Why are some zero values replaced with missing values? Answer: In
    columns such as Glucose, BloodPressure, SkinThickness, Insulin, and
    BMI, zero may represent an unavailable or invalid measurement rather
    than a realistic measurement.

53. What is imputation? Answer: Imputation is the process of replacing
    missing values with suitable values.

54. Why is median imputation used? Answer: The median is less affected
    by extreme values than the mean, so it can be a useful choice for
    numerical health features.

55. What does SimpleImputer(strategy=“median”) do? Answer: It replaces
    missing values in each feature with that feature’s median,
    calculated from the training data when used in the pipeline.

56. Why is StandardScaler used in the diabetes project? Answer: KNN
    depends on distances. Scaling makes the numerical features
    comparable so that features with larger ranges do not dominate.

57. Why is a pipeline used? Answer: It combines median imputation,
    feature scaling, and KNN training in the correct order and helps
    prevent data leakage.

58. What is data leakage? Answer: Data leakage occurs when information
    from the test data or future information improperly influences model
    training, making evaluation results unreliable.

F. UBER FARE PREDICTION PROJECT

59. What is the aim of the Uber Fare Prediction project? Answer: The aim
    is to predict a ride’s fare using pickup and dropoff locations,
    distance, passenger count, and time-related features.

60. Is Uber fare prediction classification or regression? Answer: It is
    a regression problem because the output is a continuous numerical
    fare amount.

61. Which algorithms are used in the Uber fare project? Answer: Linear
    Regression and Random Forest Regression.

62. What is Linear Regression? Answer: Linear Regression models the
    relationship between input features and a continuous target using a
    linear equation.

63. What is Random Forest Regression? Answer: Random Forest Regression
    combines predictions from multiple decision trees to predict a
    numerical value.

64. What is an ensemble method? Answer: An ensemble method combines
    multiple models to produce a prediction. Random Forest is an
    ensemble of decision trees.

65. What is the Haversine formula? Answer: The Haversine formula
    calculates the great-circle distance between two points on a sphere
    using their latitude and longitude.

66. Why are latitude and longitude used? Answer: They identify
    geographical positions of pickup and dropoff locations.

67. What is distance_km? Answer: It is the calculated distance in
    kilometers between the pickup and dropoff coordinates.

68. Why are hour, day, month, and weekday extracted? Answer: They
    provide time-related information that may help the model learn fare
    patterns.

69. What is n_estimators=100 in Random Forest? Answer: It means the
    Random Forest contains 100 decision trees.

70. What is max_depth=15? Answer: It limits the maximum depth of each
    decision tree to 15.

G. MODEL EVALUATION

71. What is accuracy? Answer: Accuracy is the proportion of all
    predictions that are correct.

72. What is precision? Answer: Precision tells us, out of all positive
    predictions, how many are actually positive.

73. What is recall? Answer: Recall tells us, out of all actual positive
    cases, how many the model correctly identifies.

74. What is F1 score? Answer: F1 score is the harmonic mean of precision
    and recall. It is useful when we want to balance both.

75. What is a confusion matrix? Answer: A confusion matrix compares
    actual classes with predicted classes.

76. What are TP, TN, FP, and FN? Answer:

-   TP (True Positive): Positive case correctly predicted as positive.
-   TN (True Negative): Negative case correctly predicted as negative.
-   FP (False Positive): Negative case incorrectly predicted as
    positive.
-   FN (False Negative): Positive case incorrectly predicted as
    negative.

77. What is specificity? Answer: Specificity measures the proportion of
    actual negative cases correctly identified. Formula: TN / (TN + FP).

78. What is balanced accuracy? Answer: Balanced accuracy is the average
    recall obtained for each class. It is useful when classes are
    imbalanced.

79. What is R-squared (R2)? Answer: R2 measures how well a regression
    model explains the variation in the target. A higher value is
    generally better.

80. What is MAE? Answer: Mean Absolute Error is the average absolute
    difference between actual and predicted values. Lower is better.

81. What is RMSE? Answer: Root Mean Squared Error is the square root of
    the average squared prediction error. It penalizes large errors more
    heavily. Lower is better.

82. What is the difference between classification and regression
    metrics? Answer: Classification commonly uses accuracy, precision,
    recall, and F1 score. Regression commonly uses MAE, RMSE, and R2.

============================================================ SECTION 2:
BLOCKCHAIN TECHNOLOGY (BLT)
============================================================

A. BLOCKCHAIN BASICS

1.  What is Blockchain? Answer: Blockchain is a distributed digital
    ledger that stores records in blocks connected using cryptographic
    hashes.

2.  Why is it called a blockchain? Answer: Because blocks of records are
    linked together in a chain using hashes.

3.  What is a block? Answer: A block is a data structure that stores
    transactions or records along with information such as a timestamp
    and the previous block’s hash.

4.  What is a hash? Answer: A hash is a fixed-length output generated
    from input data using a hash function.

5.  What is cryptographic hashing? Answer: It is the process of
    converting data into a fixed-length hash using a mathematical
    algorithm.

6.  Which hash algorithm is commonly used in Bitcoin? Answer: Bitcoin
    uses SHA-256 as part of its proof-of-work process.

7.  What is a distributed ledger? Answer: A distributed ledger is a
    record of transactions shared and maintained across multiple
    computers or nodes.

8.  What is decentralization? Answer: Decentralization means control and
    data are not held by only one central authority.

9.  What is immutability? Answer: Immutability means that recorded data
    is designed to be very difficult to change without detection or
    network agreement.

10. Is blockchain completely unchangeable? Answer: No system is
    absolutely impossible to change. Blockchain makes unauthorized
    changes difficult through cryptography and consensus mechanisms.

11. What is a node? Answer: A node is a computer that participates in a
    blockchain network by storing, validating, or sharing blockchain
    data.

12. What is a peer-to-peer network? Answer: It is a network in which
    computers communicate and share information directly without
    depending entirely on a central server.

13. What is a consensus mechanism? Answer: It is a method that allows
    network participants to agree on the valid state of the blockchain.

14. What is a public blockchain? Answer: A public blockchain is open for
    anyone to participate in, subject to its protocol rules.

15. What is a private blockchain? Answer: A private blockchain restricts
    participation to authorized users or organizations.

16. What is a permissioned blockchain? Answer: It is a blockchain in
    which access or participation is controlled by permissions.

17. What is the difference between public and private blockchain?
    Answer: Public blockchains are generally open to everyone, while
    private blockchains restrict access to approved participants.

18. What is a genesis block? Answer: The genesis block is the first
    block in a blockchain.

19. What is a timestamp? Answer: A timestamp records the time associated
    with a block or transaction.

20. What is a nonce? Answer: A nonce is a number used in certain
    cryptographic processes. In proof of work, miners vary the nonce
    while searching for a valid block hash.

B. CRYPTOGRAPHY AND CONSENSUS

21. What is encryption? Answer: Encryption converts readable information
    into an unreadable form using a key. It protects confidentiality.

22. What is the difference between hashing and encryption? Answer:
    Hashing is designed to be one-way. Encryption is designed to be
    reversible by someone with the correct decryption key.

23. What is a public key? Answer: A public key is a cryptographic key
    that can be shared publicly and is used in operations such as
    verifying digital signatures.

24. What is a private key? Answer: A private key is secret information
    used to control an account or sign transactions. It must never be
    shared.

25. What is a digital signature? Answer: A digital signature is a
    cryptographic proof that helps verify the authenticity and integrity
    of a signed message or transaction.

26. What is Proof of Work (PoW)? Answer: Proof of Work is a consensus
    mechanism in which participants perform computational work to
    propose blocks.

27. What is Proof of Stake (PoS)? Answer: Proof of Stake is a consensus
    mechanism in which validators are selected and participate based
    partly on cryptocurrency they have staked.

28. What is mining? Answer: Mining is the process used in proof-of-work
    blockchains to validate and add blocks by performing computational
    work.

29. What is a validator? Answer: A validator is a participant
    responsible for proposing or checking blocks in a proof-of-stake
    blockchain.

30. What is a 51% attack? Answer: It is an attack scenario in which an
    entity controls a majority of a network’s relevant consensus power,
    potentially allowing it to reorganize recent transactions or disrupt
    the network.

C. BITCOIN AND ETHEREUM

31. What is Bitcoin? Answer: Bitcoin is a decentralized digital currency
    that operates on a peer-to-peer blockchain network.

32. Who introduced Bitcoin? Answer: Bitcoin was introduced by the
    pseudonymous person or group known as Satoshi Nakamoto.

33. What is Ethereum? Answer: Ethereum is a blockchain platform that
    supports smart contracts and decentralized applications.

34. What is Ether? Answer: Ether (ETH) is the native cryptocurrency of
    the Ethereum network.

35. What is the difference between Bitcoin and Ethereum? Answer: Bitcoin
    mainly focuses on peer-to-peer digital money. Ethereum also provides
    a programmable platform for smart contracts and decentralized
    applications.

36. What is a cryptocurrency? Answer: A cryptocurrency is a digital
    asset that uses cryptography and typically operates on a blockchain
    or similar distributed system.

37. What is a wallet? Answer: A cryptocurrency wallet manages keys used
    to access and authorize transactions associated with blockchain
    accounts.

38. Does a wallet store coins physically? Answer: No. The blockchain
    records balances and transactions. A wallet manages the keys used to
    access them.

39. What is MetaMask? Answer: MetaMask is a cryptocurrency wallet
    commonly used to interact with Ethereum and compatible blockchain
    networks.

40. What is a testnet? Answer: A testnet is a blockchain network used
    for testing applications and transactions without using real mainnet
    funds.

41. What is the mainnet? Answer: The mainnet is the live blockchain
    network where real transactions take place.

D. SMART CONTRACTS AND SOLIDITY

42. What is a smart contract? Answer: A smart contract is a program
    deployed on a blockchain that executes according to its coded rules.

43. What is Solidity? Answer: Solidity is a programming language used to
    write smart contracts for the Ethereum Virtual Machine and
    compatible platforms.

44. What is Remix IDE? Answer: Remix is a browser-based development
    environment used to write, compile, deploy, and test Solidity smart
    contracts.

45. What is the EVM? Answer: EVM stands for Ethereum Virtual Machine. It
    executes smart contract code on Ethereum.

46. What is gas in Ethereum? Answer: Gas measures the computational work
    required to execute transactions and smart contract operations.

47. Why do we pay gas fees? Answer: Gas fees compensate the network for
    processing transactions and executing smart contract operations.

48. What is a constructor in Solidity? Answer: A constructor is a
    special function that runs once when a contract is deployed.

49. What is a state variable? Answer: A state variable is stored in the
    contract’s persistent storage on the blockchain.

50. What is a function in Solidity? Answer: A function is a block of
    code that performs a specific operation in a smart contract.

51. What is a modifier? Answer: A modifier changes or checks the
    conditions under which a function can execute. It is commonly used
    for access control.

52. What does require() do? Answer: require() checks a condition. If the
    condition is false, execution reverts.

53. What is msg.sender? Answer: msg.sender is the address that directly
    called the current function.

54. What is address in Solidity? Answer: address is a data type used to
    store a blockchain account or contract address.

55. What is uint? Answer: uint is an unsigned integer type. It stores
    non-negative whole numbers.

56. What is a struct? Answer: A struct is a custom data type that groups
    related variables together.

57. What is an array? Answer: An array stores multiple values of the
    same data type or compatible type in an ordered collection.

58. What is a mapping? Answer: A mapping stores key-value associations,
    such as mapping a student ID to student details.

59. What is the difference between memory and storage? Answer: Storage
    refers to persistent contract data. Memory is temporary data used
    during function execution.

60. What is the difference between view and pure? Answer: A view
    function can read contract state but cannot modify it. A pure
    function cannot read or modify contract state.

61. What does public mean in Solidity? Answer: The public visibility
    modifier allows a function or variable to be accessed externally,
    subject to Solidity rules.

62. What is an event in Solidity? Answer: An event records information
    in transaction logs so external applications can observe contract
    activity.

63. What is contract deployment? Answer: Deployment means publishing a
    compiled smart contract to a blockchain by sending a deployment
    transaction.

E. STUDENT MARKS MANAGEMENT SMART CONTRACT

64. What is the aim of a Student Marks Management smart contract?
    Answer: It stores and manages student records, such as student ID,
    first name, last name, and marks, on a blockchain.

65. Why is a struct used for student records? Answer: A struct groups
    related student details into one custom data type.

66. Why is an array used? Answer: An array can store multiple student
    records.

67. Why is an owner variable used? Answer: It stores the address of the
    account that deployed the contract and can be used to restrict
    administrative operations.

68. What is an onlyOwner modifier? Answer: It is an access-control
    modifier that allows only the contract owner to execute protected
    functions.

69. What does require(msg.sender == owner) check? Answer: It checks
    whether the caller’s address matches the owner’s address. Otherwise,
    the transaction reverts.

70. How can a student record be added? Answer: A function can create a
    Student struct and append it to the student records array.

71. How can a student record be updated? Answer: A function can search
    for the student using an ID and update the required fields if the
    record is found.

72. How can a student be searched by ID? Answer: The contract can loop
    through the student records, compare each record’s ID with the
    requested ID, and return the matching details.

73. Why should student IDs be unique? Answer: Unique IDs help identify
    each student correctly and avoid duplicate records.

74. What happens if a require condition fails? Answer: The transaction
    reverts, and state changes made by that transaction are undone.

75. Is data on a public blockchain private? Answer: No. Data on a public
    blockchain is generally visible to network participants. Sensitive
    personal information should not be stored directly in public
    contract storage.

============================================================ SECTION 3:
DESIGN AND ANALYSIS OF ALGORITHMS (DAA)
============================================================

A. ALGORITHM BASICS

1.  What is an algorithm? Answer: An algorithm is a finite sequence of
    clear steps used to solve a problem.

2.  What are the characteristics of an algorithm? Answer:

-   Input: It may accept zero or more inputs.
-   Output: It produces at least one result.
-   Definiteness: Each step is clear.
-   Finiteness: It terminates after a finite number of steps.
-   Effectiveness: Each step can be performed.

3.  What is time complexity? Answer: Time complexity describes how the
    running time of an algorithm grows as the input size increases.

4.  What is space complexity? Answer: Space complexity describes how
    much memory an algorithm uses as the input size increases.

5.  What is asymptotic analysis? Answer: Asymptotic analysis studies the
    growth of an algorithm’s resource usage for large input sizes.

6.  What is Big O notation? Answer: Big O describes an asymptotic upper
    bound on the growth rate of an algorithm.

7.  What is Omega notation? Answer: Omega describes an asymptotic lower
    bound on the growth rate.

8.  What is Theta notation? Answer: Theta describes a tight asymptotic
    bound when upper and lower bounds have the same growth rate.

9.  What is best-case complexity? Answer: It is the minimum work an
    algorithm performs for an input of a particular size.

10. What is average-case complexity? Answer: It is the expected work
    over inputs of a particular size, based on an assumed input
    distribution.

11. What is worst-case complexity? Answer: It is the maximum work an
    algorithm performs for inputs of a particular size.

12. What is recursion? Answer: Recursion is a programming technique in
    which a function calls itself to solve smaller versions of a
    problem.

13. What is a base case? Answer: A base case is the stopping condition
    that prevents recursive calls from continuing forever.

14. What is iteration? Answer: Iteration repeats a set of instructions
    using loops such as for or while.

15. What is the difference between recursion and iteration? Answer:
    Recursion uses function calls and a call stack. Iteration uses loops
    and usually requires less function-call overhead.

B. SEARCHING ALGORITHMS

16. What is searching? Answer: Searching is the process of finding a
    required element in a collection of data.

17. What is Linear Search? Answer: Linear Search checks elements one by
    one until the target is found or the collection ends.

18. What is the time complexity of Linear Search? Answer:

-   Best case: O(1)
-   Average case: O(n)
-   Worst case: O(n)

19. Does Linear Search require sorted data? Answer: No. It works on both
    sorted and unsorted data.

20. What is Binary Search? Answer: Binary Search repeatedly divides a
    sorted search range into two halves to find the target.

21. What is the main condition for Binary Search? Answer: The data must
    be sorted.

22. What is the time complexity of Binary Search? Answer:

-   Best case: O(1)
-   Average and worst case: O(log n)

23. Why is Binary Search faster than Linear Search for large sorted
    data? Answer: Binary Search removes half of the remaining search
    range at every step, while Linear Search checks elements one by one.

24. What are low, high, and mid in Binary Search? Answer:

-   low: Starting index of the current search range.
-   high: Ending index of the current search range.
-   mid: Middle index, commonly calculated as low + (high - low) / 2.

C. SORTING ALGORITHMS

25. What is sorting? Answer: Sorting is arranging data in a particular
    order, such as ascending or descending order.

26. What is Bubble Sort? Answer: Bubble Sort repeatedly compares
    adjacent elements and swaps them if they are in the wrong order.

27. What is the time complexity of Bubble Sort? Answer:

-   Average case: O(n^2)
-   Worst case: O(n^2)
-   Best case: O(n) when an optimized version detects that no swaps are
    needed.

28. What is Selection Sort? Answer: Selection Sort repeatedly finds the
    smallest element from the unsorted part and places it at the
    beginning of that part.

29. What is the time complexity of Selection Sort? Answer: Best,
    average, and worst cases are O(n^2).

30. What is Insertion Sort? Answer: Insertion Sort builds a sorted
    portion by taking one element at a time and inserting it into its
    correct position.

31. What is the time complexity of Insertion Sort? Answer:

-   Best case: O(n)
-   Average case: O(n^2)
-   Worst case: O(n^2)

32. Which sorting algorithm is suitable for nearly sorted data? Answer:
    Insertion Sort is often efficient for small or nearly sorted
    datasets.

33. What is Merge Sort? Answer: Merge Sort divides the array into
    smaller parts, sorts them recursively, and merges the sorted parts.

34. What is the time complexity of Merge Sort? Answer: O(n log n) in
    best, average, and worst cases.

35. What is the space complexity of Merge Sort? Answer: Standard
    array-based Merge Sort generally requires O(n) auxiliary space.

36. What is Quick Sort? Answer: Quick Sort selects a pivot, partitions
    elements around it, and recursively sorts the resulting parts.

37. What is a pivot? Answer: A pivot is the selected element used to
    divide the array during Quick Sort.

38. What is partitioning? Answer: Partitioning rearranges elements so
    that values on one side of the pivot are smaller and values on the
    other side are larger, according to the chosen partition rule.

39. What is the time complexity of Quick Sort? Answer:

-   Best and average case: O(n log n)
-   Worst case: O(n^2)

40. What is Randomized Quick Sort? Answer: Randomized Quick Sort chooses
    the pivot randomly to reduce the chance of repeatedly getting highly
    unbalanced partitions.

41. What is the difference between Merge Sort and Quick Sort? Answer:
    Merge Sort has O(n log n) worst-case time and usually needs O(n)
    extra array space. Quick Sort has O(n log n) average time, O(n^2)
    worst-case time, and is often implemented in-place.

D. DIVIDE AND CONQUER

42. What is Divide and Conquer? Answer: It is a problem-solving
    technique that divides a problem into smaller subproblems, solves
    them, and combines their results.

43. What are the three steps of Divide and Conquer? Answer:

-   Divide: Break the problem into smaller subproblems.
-   Conquer: Solve the subproblems.
-   Combine: Combine their solutions.

44. Give examples of Divide and Conquer algorithms. Answer: Binary
    Search, Merge Sort, and Quick Sort.

45. Why is Merge Sort a Divide and Conquer algorithm? Answer: It divides
    the array into halves, recursively sorts each half, and merges the
    sorted halves.

E. GREEDY ALGORITHMS

46. What is a Greedy Algorithm? Answer: A Greedy Algorithm makes the
    best locally available choice at each step, hoping to obtain a good
    overall solution.

47. Does a greedy algorithm always give the optimal solution? Answer:
    No. It gives an optimal solution only when the problem has the
    required greedy-choice property and optimal substructure.

48. What is Fractional Knapsack? Answer: Fractional Knapsack is an
    optimization problem in which we can take a fraction of an item to
    maximize total profit within a weight limit.

49. Which approach is used for Fractional Knapsack? Answer: A greedy
    approach is used. Items are sorted by profit-to-weight ratio in
    descending order.

50. What is the time complexity of Fractional Knapsack? Answer: O(n log
    n), mainly because of sorting the items.

51. What is the difference between Fractional and 0/1 Knapsack? Answer:
    Fractional Knapsack allows taking part of an item. 0/1 Knapsack
    allows either taking the whole item or not taking it.

52. What is Huffman Coding? Answer: Huffman Coding is a greedy algorithm
    that creates variable-length prefix codes based on character
    frequencies.

53. What is a prefix code? Answer: A prefix code is a code in which no
    symbol’s code is the prefix of another symbol’s code.

54. Why is Huffman Coding used? Answer: It reduces the average number of
    bits needed to represent symbols and is used in lossless data
    compression.

55. Which data structure is used in Huffman Coding? Answer: A priority
    queue, commonly implemented using a min-heap, selects the two nodes
    with the lowest frequencies.

56. What is the time complexity of Huffman Coding? Answer: O(n log n)
    when a priority queue is used for n distinct symbols.

F. DYNAMIC PROGRAMMING

57. What is Dynamic Programming? Answer: Dynamic Programming solves
    problems by breaking them into overlapping subproblems and storing
    their results to avoid repeated calculations.

58. What are overlapping subproblems? Answer: They occur when the same
    smaller problems are solved repeatedly.

59. What is optimal substructure? Answer: A problem has optimal
    substructure when an optimal solution can be built from optimal
    solutions to its smaller subproblems.

60. What are the two approaches to Dynamic Programming? Answer:

-   Memoization: Top-down approach using recursion and storing results.
-   Tabulation: Bottom-up approach using a table.

61. What is the 0/1 Knapsack problem? Answer: It is an optimization
    problem where each item can either be selected completely or
    rejected, with the goal of maximizing profit within a weight
    capacity.

62. What is the recurrence relation for 0/1 Knapsack? Answer: If item i
    has weight wt[i] and profit val[i], then:

-   If wt[i] is greater than capacity w, exclude the item.
-   Otherwise, take the maximum of excluding it and including it:
    dp[i][w] = max(dp[i-1][w], val[i] + dp[i-1][w-wt[i]]).

63. What is the time complexity of 0/1 Knapsack using tabulation?
    Answer: O(nW), where n is the number of items and W is the capacity.

64. What is the space complexity of the standard 2D DP solution? Answer:
    O(nW).

65. What is the difference between Greedy and Dynamic Programming?
    Answer: Greedy makes a local choice at each step. Dynamic
    Programming compares solutions to subproblems and stores results to
    obtain an optimal solution when its conditions apply.

G. BACKTRACKING

66. What is Backtracking? Answer: Backtracking builds a solution step by
    step. If a choice cannot lead to a valid solution, it undoes that
    choice and tries another.

67. What is the N-Queens problem? Answer: The N-Queens problem asks us
    to place N queens on an N by N chessboard so that no two queens
    attack each other.

68. Why can two queens not be in the same row or column? Answer: A queen
    can attack horizontally, vertically, and diagonally. A valid
    arrangement must avoid all these conflicts.

69. How does the N-Queens algorithm work? Answer:

-   Place a queen in a safe position in the current row.
-   Move to the next row recursively.
-   If no safe position is available, remove the previous queen and try
    another position.
-   If all queens are placed, a solution is found.

70. What is the purpose of the isSafe() function? Answer: It checks
    whether a queen can be placed at a given position without attacking
    another queen.

71. What is backtracking in N-Queens? Answer: If a queen placement
    prevents a complete solution, the algorithm removes that queen and
    tries a different column.

72. What is the base case in N-Queens? Answer: When all N rows have been
    filled with queens, a valid solution has been found.

73. What is the difference between recursion and backtracking? Answer:
    Recursion is a technique in which a function calls itself.
    Backtracking is a problem-solving strategy that often uses recursion
    to explore choices and undo invalid ones.

H. FIBONACCI AND COMPLEXITY

74. What is the Fibonacci series? Answer: It is a sequence in which each
    number is the sum of the previous two numbers. A common starting
    sequence is 0, 1, 1, 2, 3, 5, 8.

75. What is the Fibonacci recurrence relation? Answer: F(n) = F(n-1) +
    F(n-2), with F(0) = 0 and F(1) = 1.

76. What is the time complexity of iterative Fibonacci? Answer: O(n),
    because the loop calculates each term once.

77. What is the time complexity of naive recursive Fibonacci? Answer:
    O(2^n) as a common upper-bound description, because it repeatedly
    recalculates the same values.

78. How can recursive Fibonacci be optimized? Answer: Use memoization or
    dynamic programming to store already calculated Fibonacci values.

79. What is a comparison count? Answer: It is the number of comparisons
    performed by an algorithm according to the specific comparisons
    counted in the program.

80. Why do we analyze algorithms? Answer: To compare efficiency,
    estimate resource usage, and choose a suitable solution for larger
    inputs.

I. QUICK COMPLEXITY REVISION

Algorithm Best Average Worst Linear Search O(1) O(n) O(n) Binary Search
O(1) O(log n) O(log n) Bubble Sort (optimized) O(n) O(n^2) O(n^2)
Selection Sort O(n^2) O(n^2) O(n^2) Insertion Sort O(n) O(n^2) O(n^2)
Merge Sort O(n log n) O(n log n) O(n log n) Quick Sort O(n log n) O(n
log n) O(n^2) Fractional Knapsack O(n log n) O(n log n) O(n log n)
Huffman Coding O(n log n) O(n log n) O(n log n) 0/1 Knapsack DP O(nW)
time O(nW) time O(nW) time

Note: Complexity depends on the implementation and assumptions. For 0/1
Knapsack, n is the number of items and W is the capacity.

============================================================ LAST-MINUTE
VIVA PREPARATION TIPS
============================================================

1.  Start by explaining the aim of the practical or project in one or
    two sentences.
2.  Be ready to identify the input, output, algorithm, and dataset used.
3.  Explain why each preprocessing step is needed.
4.  Know the difference between training and testing data.
5.  For ML, revise the algorithm, important parameters, and evaluation
    metrics.
6.  For BLT, revise blocks, hashes, consensus, wallets, gas, Solidity,
    and smart contracts.
7.  For DAA, revise the algorithm steps, base cases, time complexity,
    and space complexity.
8.  If asked to dry-run an algorithm, use a small example and show each
    important step.
9.  If you do not know an answer, explain the part you understand
    clearly instead of guessing.
10. Remember: understanding the logic is more important than memorizing
    the exact wording.

END OF DOCUMENT
