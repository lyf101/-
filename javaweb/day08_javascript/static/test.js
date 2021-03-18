console.log(1||0)

console.log(1&&0)

function Student() {

}

s = new Student()

s.name = "ks"
console.log(s);

s.age=23
console.log(s)


arr = new Array("张三",23,"nsad")
//forEach
arr.forEach(function (item) {
    console.log(item);
})






//map遍历
newArr = arr.map(function (item,index) {
    return item+index
})
console.log(newArr)

arr2=new Array("李四",22,"dasd")

arr3 = arr.concat(arr2)
/*console.log(arr3)
//删除最后一位，并返回
arr4 = arr3.pop()
console.log(arr4)
console.log(arr3)
//删除头一位并返回
arr4=arr3.shift()
console.log(arr4)
//末尾添加一个或多个
arr3.push(0,2)
console.log(arr3)
//在开头添加多个
arr3.unshift("132",1322)
console.log(arr3)
//在x位置删除y位补充z位

arr3.splice(0,4)
console.log(arr3)*/


for (a in arr){
    console.log(arr[a])
}

//使用for-in遍历对象的属性，类似遍历数组方式
for (ss in s){
    console.log(s[ss])
}

