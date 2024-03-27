operating system is divided into two parts
    kernel - core part
    shell - means to interact with kernel. 

two types of mode
    user mode (mode bit 1)
    kernel mode (mode bit 0)

CPU bound vs IO bound process:
    CPU intensive - cpu intensive. 
    IO intensive - io intensive. 

Program - set of instructions
Process - instance of the executing program
Thread - process executes via threads.


Critical section: the part of code or program where shared resources are accessed and manipulated by multiple threads or processes.

Solution to critical section problem:
    1. mutual exclusion - only one process can execute in critical section. 
    2. progress - if the cs is free and a process tries to access it, it is allowed.
    3. bounded waiting - a process finished executing inside a critical section, should     
            not be allowed again if there are other waiting processes. 

A single solution satisfying all three conditions :- Peterson's algorithm. 

OS provides us with two solutions, 
    1. Semaphore - 
        wait() or P() or degrade - decreases count by 1. 
        signal() or V() or upgrade() - increases count by 1. 
    2. Monitor

CPU generates an address based on the secondary memory, which is known as logical address.
    it is translated into physical address, to be mapped to the main memory. 
    MMU - Memory Management Unit - translates the logical address to physical address.

Virtual memory is the memory management technique where secondary memory can be used as if it were part 
of the main memory. It swaps the data between RAM and disk storage.

Thrashing - lots of swaps by virtual memory between RAM and disk storage.   

Fragmentation:
    processes cannot be allocated to memory blocks, and the memory blocks are sometimes left unused.
    
    1. External - overall memory is sufficient, but it is not contiguous, hence cannot be used. - 
                - compaction can be used to solve this. group the used space together. 

    2. Internal - memory block assigned to process is bigger, some memory is left unused and cannot be accessed by another process. 


Memory Management Tech. 

Contiguous 

    1. Fixed partition - fixed number of partitions in a given space. 
    2. Variable sized partition - depending on the process size, the memory is allocated.

Non-contiguous

    1. Paging - pages of fixed size are stored in different parts of the main memory. 
            - a page table is used to point to the address of each page. 
            - when cpu generates a logical address, the page table maps it to it's correct physical address.
    2. Segmentation
            - non contiguous and variable sized memory is allocated. 