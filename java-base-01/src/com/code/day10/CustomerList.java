package com.code.day10;

public class CustomerList {

        private Customer[] customers;
        private int total = 0;
        private int currentId = 1;
        public CustomerList(int totalCustomer) {
            customers = new Customer[totalCustomer];
        }
        public boolean addCustomer(Customer customer){
            if(total >= customers.length){
                return false;
            }
            customers[total++] = customer;
            customer.setId(currentId++);
            return true;
        }
        public boolean replaceCustomer(Customer customer){
            for(int i = 0; i < total; i++){
                if(customers[i].getId() == customer.getId()){
                    customers[i] = customer;
                    return true;
                }
            }
            return false;
        }
        public boolean deleteCustomer(int id){
            int index = -1;
            for(int i = 0; i < total; i++){
                if(customers[i].getId() == id){
                    index = i;
                    break;
                }
            }
            if(index == -1){
                return false;
            }
            for(int i = index; i < total - 1; i++){
                customers[i] = customers[i + 1];
            }
            total--;
            customers[total] = null;
            return true;
        }
        public Customer[] getAllCustomers(){
            Customer[] all = new Customer[total];
            for(int i = 0; i < total; i++){
                all[i] = customers[i];
            }
            return all;
        }
        public Customer getCustomer(int id){
            for(int i = 0; i < total; i++){
                if(customers[i].getId() == id){
                    return customers[i];
                }
            }
            return null;
        }
        public int getTotal(){
            return total;
        }
    }




