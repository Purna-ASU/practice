package com.apex.practise;

import java.util.HashMap;
import java.util.Map;

public class TotalSharesValue {
	
	public static void main(String[] args) {

		// HashMap containing market listings with names and NAV values

        Map<String, Double> marketListings = new HashMap<>();

        

        marketListings.put("META", 300.50);

        marketListings.put("MSFT", 340.75);

        marketListings.put("TSLA", 250.25);

        

        // Array of HashMaps containing account holdings with account number, listing name, and quantity of stocks

        HashMap<String, String>[] accountHoldings = new HashMap[] {

                    

        		new HashMap<String, String>() {{

                    put("accountNumber", "12345");

                    put("listingName","META");

                    put("quantity", "100");

                }},

                new HashMap<String, String>() {{

                    put("accountNumber", "12345");

                    put("listingName", "MSFT");

                    put("quantity", "50");

                }},

                new HashMap<String, String>() {{

                    put("accountNumber", "54321");

                    put("listingName", "TSLA");

                    put("quantity", "75");

                }}

                

        };



        // HashMap to store the total values for each account

        HashMap<String, Double> accountValues = new HashMap<>();



        for (HashMap<String, String> holding : accountHoldings) {

            String accountNumber = holding.get("accountNumber");

            String listingName = holding.get("listingName");

            int quantity = Integer.parseInt(holding.get("quantity"));



            if (marketListings.containsKey(listingName)) {

                double nav = marketListings.get(listingName);

                double value = nav * quantity;



                accountValues.put(accountNumber, accountValues.getOrDefault(accountNumber, 0.0) + value);

             

            }

        }

    

        accountValues.forEach((k,v)->System.out.printf("Account %s: Total Value = $%.2f%n", k, v));

    }

	}






