#!/bin/bash
while IFS=$'\t\n\r' read -r line; do
curl -X GET "http://trlivebrmws01.online.gruppo24.net:10101/accountingws/rest/deliveryRest/getHrPlanList?listName=${line}" -H "accept: application/json"
echo -e
done < lista.txt