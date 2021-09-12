# JavaWeb笔记

## 第一章 html和css
### 一、html介绍

#### 1.html标签介绍

1. 标签的格式: ```<标签名>封装的数据 ```

2.  标签名大小写不敏感。 

3. 标签拥有自己的属性。 

   1. 分为基本属性：```bgcolor="red" ```可以修改简单的样式效果
   2. 事件属性： ```onclick="alert('你好！');"``` 可以直接设置事件响应后的代码。

4. 标签又分为，单标签和双标签。

   1. 单标签格式： <标签名 /> br 换行 hr 水平线
   2.  ii. 双标签格式: <标签名> ...封装的数据...

5. 标签的语法

   1. 标签不能交叉嵌套
   2. 标签必须正确关闭
   3. 属性必须有值，属性值必须加引号
   4. 注释不能嵌套
#### 2.常用标签介绍

##### 2.1font字体标签

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1.font标签.html</title>
</head>
<body>
	<!-- 字体标签
	 需求1：在网页上显示 我是字体标签 ，并修改字体为 宋体，颜色为红色。

	 font标签是字体标签,它可以用来修改文本的字体,颜色,大小(尺寸)
	 	color属性修改颜色
	 	face属性修改字体
	 	size属性修改文本大小
	 -->
	<font color="red" face="宋体" size="7">我是字体标签</font>
</body>
</html>
```

##### 2.2特殊字符

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2.特殊字符.html</title>
</head>
<body>
	<!-- 特殊字符
	需求1：把 <br> 换行标签 变成文本 转换成字符显示在页面上

	常用的特殊字符:
		<	===>>>>		&lt;
		>   ===>>>>		&gt;
	  空格	===>>>>		&nbsp;

	 -->
	我是&lt;br&gt;标签<br/>
	国哥好&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;帅啊!
</body>
</html>
```

- 常用的特殊字符表

  ![image-20210826103216249](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210826103216249.png)

- 其他特殊字符表

  ![image-20210826103241125](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210826103241125.png)

##### 2.3 标题标签

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3.标题标签.html</title>
</head>
<body>
	<!-- 标题标签
	 需求1：演示标题1到 标题6的

	 	h1 - h6 都是标题标签
	 	h1 最大
	 	h6 最小
			align 属性是对齐属性
				left		左对齐(默认)
				center		剧中
				right		右对齐
	 -->
	<h1 align="left">标题1</h1>
	<h2 align="center">标题2</h2>
	<h3 align="right">标题3</h3>
	<h4>标题4</h4>
	<h5>标题5</h5>
	<h6>标题6</h6>
	<h7>标题7</h7>
</body>
</html>
```

##### 2.4**超链接**(重点)

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>4.超链接.html</title>
</head>
<body>
	<!-- a标签是 超链接
	 		href属性设置连接的地址
	 		target属性设置哪个目标进行跳转
	 			_self		表示当前页面(默认值)
	 			_blank		表示打开新页面来进行跳转
	 -->
	<a href="http://localhost:8080">百度</a><br/>
	<a href="http://localhost:8080" target="_self">百度_self</a><br/>
	<a href="http://localhost:8080" target="_blank">百度_blank</a><br/>
</body>
</html>
```

##### 2.5 列表标签

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <!--需求1：使用无序，列表方式，把东北F4，赵四，刘能，小沈阳，宋小宝，展示出来
        ul 是无序列表
            type属性可以修改列表项前面的符号
        li  是列表项
    -->
    <ul type="none">
        <li>赵四</li>
        <li>刘能</li>
        <li>小沈阳</li>
        <li>宋小宝</li>
    </ul>
</body>
</html>
```

##### 2.6 img 标签

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>5.img标签.html</title>
</head>
<body>
    <!--需求1：使用img标签显示一张美女的照片。并修改宽高，和边框属性

        img标签是图片标签,用来显示图片
            src属性可以设置图片的路径
            width属性设置图片的宽度
            height属性设置图片的高度
            border属性设置图片边框大小
            alt属性设置当指定路径找不到图片时,用来代替显示的文本内容

        在JavaSE中路径也分为相对路径和绝对路径.
            相对路径:从工程名开始算

            绝对路径:盘符:/目录/文件名

        在web中路径分为相对路径和绝对路径两种
            相对路径:
                .           表示当前文件所在的目录
                ..          表示当前文件所在的上一级目录
                文件名      表示当前文件所在目录的文件,相当于 ./文件名            ./ 可以省略

            绝对路径:
                正确格式是:  http://ip:port/工程名/资源路径

                错误格式是:  盘符:/目录/文件名
    -->
    <img src="1.jpg" width="200" height="260" border="1" alt="美女找不到"/>
    <img src="../../2.jpg" width="200" height="260" />
    <img src="../imgs/3.jpg" width="200" height="260" />
    <img src="../imgs/4.jpg" width="200" height="260" />
    <img src="../imgs/5.jpg" width="200" height="260" />
    <img src="../imgs/6.jpg" width="200" height="260" />
</body>
</html>
```

##### 2.7 表格标签

```html
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>表格标签</title>
</head>
<body>
<!--
	需求1：做一个 带表头的 ，三行，三列的表格，并显示边框
	需求2：修改表格的宽度，高度，表格的对齐方式，单元格间距。

		table 标签是表格标签
			border 设置表格标签
			width 设置表格宽度
			height 设置表格高度
			align 设置表格相对于页面的对齐方式
			cellspacing 设置单元格间距

		tr	 是行标签
		th	是表头标签
		td  是单元格标签
			align 设置单元格文本对齐方式

		b 是加粗标签

	-->

<table align="center" border="1" width="300" height="300" cellspacing="0">
    <tr>
        <th>1.1</th>
        <th>1.2</th>
        <th>1.3</th>
    </tr>
    <tr>
        <td>2.1</td>
        <td>2.2</td>
        <td>2.3</td>
    </tr>
    <tr>
        <td>3.1</td>
        <td>3.2</td>
        <td>3.3</td>
    </tr>
</table>
</body>
</html>
```

##### 2.8跨行跨列表格

```html
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>7.表格的跨行跨列</title>
	</head>
	<body>
<!--	需求1：
			新建一个五行，五列的表格，
			第一行，第一列的单元格要跨两列，
			第二行第一列的单元格跨两行，
			第四行第四列的单元格跨两行两列。

			colspan 属性设置跨列
			rowspan 属性设置跨行
			-->

		<table width="500" height="500" cellspacing="0" border="1">
			<tr>
				<td colspan="2">1.1</td>
				<td>1.3</td>
				<td>1.4</td>
				<td>1.5</td>
			</tr>
			<tr>
				<td rowspan="2">2.1</td>
				<td>2.2</td>
				<td>2.3</td>
				<td>2.4</td>
				<td>2.5</td>
			</tr>
			<tr>
				<td>3.2</td>
				<td>3.3</td>
				<td>3.4</td>
				<td>3.5</td>
			</tr>
			<tr>
				<td>4.1</td>
				<td>4.2</td>
				<td>4.3</td>
				<td colspan="2" rowspan="2">4.4</td>
			</tr>
			<tr>
				<td>5.1</td>
				<td>5.2</td>
				<td>5.3</td>
			</tr>
		</table>
	</body>
</html>
```

##### 2.9 了解iframe 框架标签(内嵌窗口)

ifarme 标签它可以在一个 html 页面上,打开一个小窗口,去加载一个单独的页面

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>8.iframe标签.html</title>
</head>
<body>
	我是一个单独的完整的页面<br/><br/>
    <!--ifarme标签可以在页面上开辟一个小区域显示一个单独的页面
            ifarme和a标签组合使用的步骤:
                1 在iframe标签中使用name属性定义一个名称
                2 在a标签的target属性上设置iframe的name的属性值
    -->
    <iframe src="3.标题标签.html" width="500" height="400" name="abc"></iframe>
    <br/>

    <ul>
        <li><a href="0-标签语法.html" target="abc">0-标签语法.html</a></li>
        <li><a href="1.font标签.html" target="abc">1.font标签.html</a></li>
        <li><a href="2.特殊字符.html" target="abc">2.特殊字符.html</a></li>
    </ul>
</body>
</html>
```

##### 2.10 表单标签

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>表单的显示</title>
</head>
<body>
<!--需求1:创建一个个人信息注册的表单界面。包含用户名，密码，确认密码。性别（单选），兴趣爱好（多选），国籍（下拉列表）。
隐藏域，自我评价（多行文本域）。重置，提交。-->

    <!--
        form标签就是表单
            input type=text     是文件输入框  value设置默认显示内容
            input type=password 是密码输入框  value设置默认显示内容
            input type=radio    是单选框    name属性可以对其进行分组   checked="checked"表示默认选中
            input type=checkbox 是复选框   checked="checked"表示默认选中
            input type=reset    是重置按钮      value属性修改按钮上的文本
            input type=submit   是提交按钮      value属性修改按钮上的文本
            input type=button   是按钮          value属性修改按钮上的文本
            input type=file     是文件上传域
            input type=hidden   是隐藏域    当我们要发送某些信息，而这些信息，不需要用户参与，就可以使用隐藏域（提交的时候同时发送给服务器）

            select 标签是下拉列表框
            option 标签是下拉列表框中的选项 selected="selected"设置默认选中

            textarea 表示多行文本输入框 （起始标签和结束标签中的内容是默认值）
                rows 属性设置可以显示几行的高度
                cols 属性设置每行可以显示几个字符宽度




    -->
    <form>
        <h1 align="center">用户注册</h1>
        <table align="center">
            <tr>
                <td> 用户名称：</td>
                <td>
                    <input type="text" value="默认值"/>
                </td>
            </tr>
            <tr>
                <td> 用户密码：</td>
                <td><input type="password" value="abc"/></td>
            </tr>
            <tr>
                <td>确认密码：</td>
                <td><input type="password" value="abc"/></td>
            </tr>
             <tr>
                <td>性别：</td>
                <td>
                    <input type="radio" name="sex"/>男
                    <input type="radio" name="sex" checked="checked"  />女
                </td>
            </tr>
             <tr>
                <td> 兴趣爱好：</td>
                <td>
                    <input type="checkbox" checked="checked" />Java
                    <input type="checkbox" />JavaScript
                    <input type="checkbox" />C++
                </td>
            </tr>
             <tr>
                <td>国籍：</td>
                <td>
                    <select>
                        <option>--请选择国籍--</option>
                        <option selected="selected">中国</option>
                        <option>美国</option>
                        <option>小日本</option>
                    </select>
                </td>
            </tr>
             <tr>
                <td>自我评价：</td>
                <td><textarea rows="10" cols="20">我才是默认值</textarea></td>
            </tr>
             <tr>
                <td><input type="reset" /></td>
                <td align="center"><input type="submit"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
```

- 表单提交细节

  - form 标签是表单标签 

    - action 属性设置提交的服务器地址 
    - method 属性设置提交的方式 GET(默认值)或 POST 

  - 表单提交的时候，数据没有发送给服务器的三种情况： 

    1. 表单项没有 name 属性值 

    2. 单选、复选（下拉列表中的 option 标签）都需要添加 value 属性，以便发送给服务器 

    3. 表单项不在提交的 form 标签中 

  - GET 请求的特点是:

    1. 浏览器地址栏中的地址是：action 属性[+?+请求参数]  请求参数的格式是：name=value&name=value 
    2. 不安全 
    3. 它有数据长度的限制 

  - POST 请求的特点是： 

    1. 浏览器地址栏中只有 action 属性值 

    2. 相对于 GET 请求要安全 

    3. 理论上没有数据长度的限制 

##### 2.11 其他标签

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>其他标签</title>
</head>
<body>
        <!--需求1：div、span、p标签的演示
            div标签       默认独占一行
            span标签      它的长度是封装数据的长度
            p段落标签     默认会在段落的上方或下方各空出一行来（如果已有就不再空）
        -->
    <div>div标签1</div>
    <div>div标签2</div>
    <span>span标签1</span>
    <span>span标签2</span>
    <p>p段落标签1</p>
    <p>p段落标签2</p>
</body>
</html>
```

### 二、CSS技术介绍

CSS 是「层叠样式表单」。是用于(增强)控制网页样式并允许将样式信息与网页内容分离的一种标记性语言。

#### 1.CSS 语法规则

![image-20210826113410383](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210826113410383.png)

**选择器**：浏览器根据“选择器”决定受 CSS 样式影响的 HTML 元素（标签）。 

**属性** (property) 是你要改变的样式名，并且每个属性都有一个值。属性和值被冒号分开，并由花括号包围，这样就组成了一个完整的样式声明（declaration），例如：p {color: blue} 

**多个声明：**如果要定义不止一个声明，则需要用分号将每个声明分开。虽然最后一条声明的最后可以不加分号(但尽量在每条声明的末尾都加上分号)

例如：

```html
p{ 
	color:red;
	font-size:30px; 
}
```

#### 2.CSS和HTML的结合方式

##### 2.1第一种

在标签的 style 属性上设置”key:value value;”，修改标签样式

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <!--需求1：分别定义两个 div、span标签，分别修改每个 div 标签的样式为：边框1个像素，实线，红色。-->
    <div style="border: 1px solid red;">div标签1</div>
    <div style="border: 1px solid red;">div标签2</div>
    <span style="border: 1px solid red;">span标签1</span>
    <span style="border: 1px solid red;">span标签2</span>
</body>
</html>
```

##### 2.2第二种 标签名选择器

在 head 标签中，使用 style 标签来定义各种自己需要的 css 样式。 

格式如下：

``` html
xxx {

	Key : value value; 

} 
```

```html
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>CSS选择器</title>
	<style type="text/css">
		div{
			border: 1px solid yellow;
			color: blue;
			font-size: 30px;
		}
		span{
			border: 5px dashed  blue;
			color: yellow;
			font-size: 20px;
		}
	</style>
</head>
<body>
	<!-- 
	需求1：在所有div标签上修改字体颜色为蓝色，字体大小30个像素。边框为1像素黄色实线。
	并且修改所有span 标签的字体颜色为黄色，字体大小20个像素。边框为5像素蓝色虚线。
	 -->
	<div>div标签1</div>
	<div>div标签2</div>
	<span>span标签1</span>
	<span>span标签2</span>
</body>
</html>
```

##### 2.3 ID选择器

```html
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ID选择器</title>
	<style type="text/css">

		#id001{
			color: blue;
			font-size: 30px;
			border: 1px yellow solid;
		}

		#id002{
			color: red;
			font-size: 20px;
			border: 5px blue dotted ;
		}

	</style>
</head>
<body>		
	<!--
	需求1：分别定义两个 div 标签，
	第一个div 标签定义 id 为 id001 ，然后根据id 属性定义css样式修改字体颜色为蓝色，
	字体大小30个像素。边框为1像素黄色实线。
	
	第二个div 标签定义 id 为 id002 ，然后根据id 属性定义css样式 修改的字体颜色为红色，字体大小20个像素。
	边框为5像素蓝色点线。
	 -->
	
	<div id="id002">div标签1</div>
	<div id="id001">div标签2</div>
</body>
</html>

```

##### 2.4 class类型选择器

```html
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>class类型选择器</title>
	<style type="text/css">
		.class01{
			color: blue;
			font-size: 30px;
			border: 1px solid yellow;
		}

		.class02{
			color: grey;
			font-size: 26px;
			border: 1px solid red;
		}
	</style>
</head>
<body>
	<!--
		需求1：修改 class 属性值为 class01的 span 或 div 标签，字体颜色为蓝色，字体大小30个像素。边框为1像素黄色实线。
		需求2：修改 class 属性值为 class02的 div 标签，字体颜色为灰色，字体大小26个像素。边框为1像素红色实线。
	 -->

	<div class="class02">div标签class01</div>
	<div class="class02">div标签</div>
	<span class="class02">span标签class01</span>
	<span>span标签2</span>
</body>
</html>
```

##### 2.5组合选择器

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>class类型选择器</title>
    <style type="text/css">
        .class01 , #id01{
            color: blue;
            font-size: 20px;
            border:  yellow 1px solid;
        }
    </style>
</head>
<body>
	<!-- 
	需求1：修改 class="class01" 的div 标签 和 id="id01" 所有的span标签，
	字体颜色为蓝色，字体大小20个像素。边框为1像素黄色实线。
	 -->
   <div id="id01">div标签class01</div> <br />
   <span>span 标签</span>  <br />
   <div>div标签</div> <br />
   <div>div标签id01</div> <br />
</body>
</html>
```

## 第二章 JavaScript语言入门

### 2.1 JavaScript 和 html 代码的结合方

#### 2.1.1 第一种方式

只需要在 head 标签中，或者在 body 标签中， 使用script标签来书写 

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        // alert是JavaScript语言提供的一个警告框函数。
        // 它可以接收任意类型的参数，这个参数就是警告框的提示信息
        alert("hello javaScript!");
    </script>
</head>
<body>

</body>
</html>
```

#### 2.1.2 第二种方式

使用 script 标签引入 单独的 JavaScript 代码文

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!--
        现在需要使用script引入外部的js文件来执行
            src 属性专门用来引入js文件路径（可以是相对路径，也可以是绝对路径）

        script标签可以用来定义js代码，也可以用来引入js文件
        但是，两个功能二选一使用。不能同时使用两个功能
    -->
    <script type="text/javascript" src="1.js"></script>
    <script type="text/javascript">
        alert("国哥现在可以帅了");
    </script>
</head>
<body>

</body>
</html>
```

### 2.2 变量

#### 2.2.1 变量类型

JavaScript 的变量类型： 

| 类型       | 变量名   |
| ---------- | -------- |
| 数值类型   | number   |
| 字符串类型 | string   |
| 对象类型   | object   |
| 布尔类型   | boolean  |
| 函数类型   | function |

特殊值：

- undefined：未定义，所有 js 变量未赋于初始值的时候，默认值都是 undefined

- null：空值 

- NaN 全称是：Not a Number。非数字。非数值。

#### 2.2.2 关系比较运算

等于： ==  等于是简单的做字面值的比较 

全等于： ===  除了做字面值的比较之外，还会比较两个变量的数据类型

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">

        var a = "12";
        var b = 12;

        alert( a == b ); // true
        alert( a === b ); // false

    </script>
</head>
<body>

</body>
</html>
```

#### 2.2.3 逻辑运算

- 且运算： && 

- 或运算： || 

- 取反运算： ！

在 JavaScript 语言中，所有的变量，都可以做为一个 boolean 类型的变量去使用。 **0 、null、 undefined、””(空串) 都认为是 false**

&& 且运算。 有两种情况： 

- 第一种：当表达式全为真的时候。返回最后一个表达式的值。 
- 第二种：当表达式中，有一个为假的时候。返回第一个为假的表达式的值 

|| 或运算

- 第一种情况：当表达式全为假时，返回最后一个表达式的值 
- 第二种情况：只要有一个表达式为真。就会把回第一个为真的表达式的值 

**并且 && 与运算 和 ||或运算 有短路。 短路就是说，当这个&&或||运算有结果了之后 。后面的表达式不再执行**

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
   /*     在JavaScript语言中，所有的变量，都可以做为一个boolean类型的变量去使用。
        0 、null、 undefined、””(空串) 都认为是 false；*/

        // var a = 0;
        // if (a) {
        //     alert("零为真");
        // } else {
        //     alert("零为假");
        // }

        // var b = null;
        // if (b) {
        //     alert("null为真");
        // } else {
        //     alert("null为假");
        // }

        // var c = undefined;
        // if (c) {
        //     alert("undefined为真");
        // } else {
        //     alert("undefined为假");
        // }

        // var d = "";
        // if (d) {
        //     alert("空串为真");
        // } else {
        //     alert("空串为假");
        // }


/*         && 且运算。
		有两种情况：
		第一种：当表达式全为真的时候。返回最后一个表达式的值。
		第二种：当表达式中，有一个为假的时候。返回第一个为假的表达式的值*/

        var a = "abc";
        var b = true;
        var d = false;
        var c = null;

        // alert( a && b );//true
        // alert( b && a );//true
        // alert( a && d ); // false
        // alert( a && c ); // null

 /*      || 或运算
       第一种情况：当表达式全为假时，返回最后一个表达式的值
       第二种情况：只要有一个表达式为真。就会把回第一个为真的表达式的值*/
        // alert( d || c ); // null
        // alert( c|| d ); //false

        // alert( a || c ); //abc
        // alert( b || c ); //true

    </script>
</head>
<body>

</body>
</html>
```

#### 2.2.4 数组

JS 中 数组的定义格式：

```html
var 数组名 = []; // 空数组 
var 数组名 = [1 , ’abc’ , true]; // 定义数组同时赋值元素
```
示例代码
```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">

        var arr = [true,1]; // 定义一个空数组
        // alert( arr.length ); // 0

        arr[0] = 12;
        // alert( arr[0] );//12
        // alert( arr.length ); // 0

        // javaScript语言中的数组，只要我们通过数组下标赋值，那么最大的下标值，就会自动的给数组做扩容操作。
        arr[2] = "abc";
        alert(arr.length); //3

        // alert(arr[1]);// undefined
        // 数组的遍历
        for (var i = 0; i < arr.length; i++){
            alert(arr[i]);
        }

    </script>
</head>
<body>
</body>
</html>
```
#### 2.2.4函数
** 第一种，可以使用 function 关键字来定义函数。**
使用的格式如下:
```html
function 函数名(形参列表){
函数体
}
```
代码
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        // 定义一个无参函数
        function fun(){
            alert("无参函数fun()被调用了");
        }
        // 函数调用===才会执行
        // fun();

        function fun2(a ,b) {
            alert("有参函数fun2()被调用了 a=>" + a + ",b=>"+b);
        }

        // fun2(12,"abc");

        // 定义带有返回值的函数
        function sum(num1,num2) {
            var result = num1 + num2;
            return result;
        }

        alert( sum(100,50) );

    </script>
</head>
<body>

</body>
</html>
```
** 函数的第二种定义方式，格式如下：**
使用格式如下：
```var 函数名 = function(形参列表) {函数体}```
代码
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        var fun = function () {
            alert("无参函数");
        }
        // fun();

        var fun2 = function (a,b) {
            alert("有参函数a=" + a + ",b=" + b);
        }
        // fun2(1,2);

        var fun3 = function (num1,num2) {
            return num1 + num2;
        }

        alert( fun3(100,200) );
    </script>

</head>
<body>

</body>
</html>
```
## 2.3 js中的事件

**事件是电脑输入设备与页面进行交互的响应。我们称之为事件。**

常用的事件

| 事件名称 | 解释|
| ---- | ---- |
|onload 加载完成事件| 页面加载完成之后，常用于做页面 js 代码初始化操作|
|onclick 单击事件|常用于按钮的点击响应操作。|
|onblur 失去焦点事件|常用用于输入框失去焦点后验证其输入内容是否合法。|
|onchange 内容发生改变事件| 常用于下拉列表和输入框内容发生改变后操作|
|onsubmit 表单提交事件|常用于表单提交前，验证所有表单项是否合法。|

#### 2.3.1 onload加载完成事件

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        // onload事件的方法
        function onloadFun() {
            alert('静态注册onload事件，所有代码');
        }

        // onload事件动态注册。是固定写法
        window.onload = function () {
            alert("动态注册的onload事件");
        }

    </script>
</head>
<!--静态注册onload事件
        onload事件是浏览器解析完页面之后就会自动触发的事件
       <body onload="onloadFun();">
-->
<body>

</body>
</html>
```
#### 2.3.2 onclick时间
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        function onclickFun() {
            alert("静态注册onclick事件");
        }

        // 动态注册onclick事件
        window.onload = function () {
            // 1 获取标签对象
            /*
            * document 是JavaScript语言提供的一个对象（文档）<br/>
            * get           获取
            * Element       元素（就是标签）
            * By            通过。。   由。。经。。。
            * Id            id属性
            *
            * getElementById通过id属性获取标签对象
            **/
            var btnObj = document.getElementById("btn01");
            // alert( btnObj );
            // 2 通过标签对象.事件名 = function(){}
            btnObj.onclick = function () {
                alert("动态注册的onclick事件");
            }
        }

    </script>
</head>
<body>
    <!--静态注册onClick事件-->
    <button onclick="onclickFun();">按钮1</button>
    <button id="btn01">按钮2</button>
</body>
</html>
```
#### 2.3.3 onblur 失去焦点事件
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        // 静态注册失去焦点事件
        function onblurFun() {
            // console是控制台对象，是由JavaScript语言提供，专门用来向浏览器的控制器打印输出， 用于测试使用
            // log() 是打印的方法
            console.log("静态注册失去焦点事件");
        }

        // 动态注册 onblur事件
        window.onload = function () {
            //1 获取标签对象
           var passwordObj = document.getElementById("password");
           // alert(passwordObj);
            //2 通过标签对象.事件名 = function(){};
            passwordObj.onblur = function () {
                console.log("动态注册失去焦点事件");
            }
        }

    </script>
</head>
<body>
    用户名:<input type="text" onblur="onblurFun();"><br/>
    密码:<input id="password" type="text" ><br/>
</body>
</html>
```
#### 2.4.4 onchange 内容发生改变事件
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <script type="text/javascript">
        function onchangeFun() {
            alert("女神已经改变了");
        }

        window.onload = function () {
            //1 获取标签对象
            var selObj = document.getElementById("sel01");
            // alert( selObj );
            //2 通过标签对象.事件名 = function(){}
            selObj.onchange = function () {
                alert("男神已经改变了");
            }
        }


    </script>
</head>
<body>
    请选择你心中的女神：
    <!--静态注册onchange事件-->
    <select onchange="onchangeFun();">
        <option>--女神--</option>
        <option>芳芳</option>
        <option>佳佳</option>
        <option>娘娘</option>
    </select>

    请选择你心中的男神：
    <select id="sel01">
        <option>--男神--</option>
        <option>国哥</option>
        <option>华仔</option>
        <option>富城</option>
    </select>


</body>
</html>
```
#### 2.4.5 onsubmit 表单提交事件
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" >
        // 静态注册表单提交事务
        function onsubmitFun(){
            // 要验证所有表单项是否合法，如果，有一个不合法就阻止表单提交
            alert("静态注册表单提交事件----发现不合法");

            return flase;
        }

        window.onload = function () {
            //1 获取标签对象
            var formObj = document.getElementById("form01");
            //2 通过标签对象.事件名 = function(){}
            formObj.onsubmit = function () {
                // 要验证所有表单项是否合法，如果，有一个不合法就阻止表单提交
                alert("动态注册表单提交事件----发现不合法");

                return false;
            }
        }

    </script>
</head>
<body>
    <!--return false 可以阻止 表单提交 -->
    <form action="http://localhost:8080" method="get" onsubmit="return onsubmitFun();">
        <input type="submit" value="静态注册"/>
    </form>
    <form action="http://localhost:8080" id="form01">
        <input type="submit" value="动态注册"/>
    </form>

</body>
</html>
```
## 2.4 DOM模型

### 2.4.1 Document 对象

Document 对象的理解：

1. Document 它管理了所有的 HTML 文档内容。 
2. document 它是一种树结构的文档。有层级关系。
3. 它让我们把所有的标签 都 对象化 
4. 我们可以通过 document 访问所有的标签对

### 2.4.3 Document 对象中的方法介绍

- document.getElementById(elementId)：通过标签的 id 属性查找标签 dom 对象，elementId 是标签的 id 属性值
- document.getElementsByName(elementName) ：通过标签的 name 属性查找标签 dom 对象，elementName 标签的 name 属性值
- document.getElementsByTagName(tagname) ：通过标签名查找标签 dom 对象。tagname 是标签名
- document.createElement( tagName)：方法，通过给定的标签名，创建一个标签对象。tagName 是要创建的标签名

**注意：**

document 对象的三个查询方法，如果有 id 属性，优先使用 getElementById 方法来进行查询

如果没有 id 属性，则优先使用getElementsByName 方法来进行查询

如果 id 属性和 name 属性都没有最后再按标签名查 getElementsByTagName

以上三个方法，一定要在页面加载完成之后执行，才能查询到标签对象。

**getElementById 方法示例代码**

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" >
        /*
        * 需求：当用户点击了较验按钮，要获取输出框中的内容。然后验证其是否合法。<br/>
        * 验证的规则是：必须由字母，数字。下划线组成。并且长度是5到12位。
        * */
        function onclickFun() {
            // 1 当我们要操作一个标签的时候，一定要先获取这个标签对象。
            var usernameObj = document.getElementById("username");
            // [object HTMLInputElement] 它就是dom对象
            var usernameText = usernameObj.value;
            // 如何 验证 字符串，符合某个规则 ，需要使用正则表达式技术
            var patt = /^\w{5,12}$/;
            /*
            *  test()方法用于测试某个字符串，是不是匹配我的规则 ，
            *  匹配就返回true。不匹配就返回false.
            * */

            var usernameSpanObj = document.getElementById("usernameSpan");
            // innerHTML 表示起始标签和结束标签中的内容
            // innerHTML 这个属性可读，可写
            usernameSpanObj.innerHTML = "国哥真可爱！";

            if (patt.test(usernameText)) {
                // alert("用户名合法！");
                // usernameSpanObj.innerHTML = "用户名合法！";
                usernameSpanObj.innerHTML = "<img src=\"right.png\" width=\"18\" height=\"18\">";
            } else {
                // alert("用户名不合法！");
                // usernameSpanObj.innerHTML = "用户名不合法！";
                usernameSpanObj.innerHTML = "<img src=\"wrong.png\" width=\"18\" height=\"18\">";
            }
        }
    </script>
</head>
<body>
    用户名：<input type="text" id="username" value="wzg"/>
    <span id="usernameSpan" style="color:red;">

    </span>
    <button onclick="onclickFun()">较验</button>
</body>
</html>
```

**getElementsByName 方法示例代码**

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        // 全选
        function checkAll() {
            // 让所有复选框都选中
            // document.getElementsByName();是根据 指定的name属性查询返回多个标签对象集合
            // 这个集合的操作跟数组 一样
            // 集合中每个元素都是dom对象
            // 这个集合中的元素顺序是他们在html页面中从上到下的顺序
            var hobbies = document.getElementsByName("hobby");
            // checked表示复选框的选中状态。如果选中是true，不选中是false
            // checked 这个属性可读，可写
            for (var i = 0; i < hobbies.length; i++){
                hobbies[i].checked = true;
            }
        }
        //全不选
        function checkNo() {

            var hobbies = document.getElementsByName("hobby");
            // checked表示复选框的选中状态。如果选中是true，不选中是false
            // checked 这个属性可读，可写
            for (var i = 0; i < hobbies.length; i++){
                hobbies[i].checked = false;
            }
        }
        // 反选
        function checkReverse() {
            var hobbies = document.getElementsByName("hobby");

            for (var i = 0; i < hobbies.length; i++) {
                hobbies[i].checked = !hobbies[i].checked;

                // if (hobbies[i].checked) {
                //     hobbies[i].checked = false;
                // }else {
                //     hobbies[i].checked = true;
                // }
            }


        }

    </script>
</head>
<body>
    兴趣爱好：
    <input type="checkbox" name="hobby" value="cpp" checked="checked">C++
    <input type="checkbox" name="hobby" value="java">Java
    <input type="checkbox" name="hobby" value="js">JavaScript
    <br/>
    <button onclick="checkAll()">全选</button>
    <button onclick="checkNo()">全不选</button>
    <button onclick="checkReverse()">反选</button>
</body>
</html>
```

**getElementsByTagName 方法示例代码：**

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        window.onload = function(){
            // alert( document.getElementById("btn01") );
        }


        // 全选
        function checkAll() {
            alert( document.getElementById("btn01") );
            // document.getElementsByTagName("input");
            // 是按照指定标签名来进行查询并返回集合
            // 这个集合的操作跟数组 一样
            // 集合中都是dom对象
            // 集合中元素顺序 是他们在html页面中从上到下的顺序。
            var inputs = document.getElementsByTagName("input");

            for (var i = 0; i < inputs.length; i++){
                inputs[i].checked = true;
            }
        }
    </script>
</head>
<body>

    <!--as -->
    兴趣爱好：
    <input type="checkbox" value="cpp" checked="checked">C++
    <input type="checkbox" value="java">Java
    <input type="checkbox" value="js">JavaScript
    <br/>
    <button id="btn01" onclick="checkAll()">全选</button>

</body>
</html>
```

**createElement 方法示例代码**

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        window.onload = function () {
            // 现在需要我们使用js代码来创建html标签，并显示在页面上
            // 标签的内容就是：<div>国哥，我爱你</div>
            var divObj = document.createElement("div"); // 在内存中 <div></div>

            var textNodeObj = document.createTextNode("国哥，我爱你"); // 有一个文本节点对象 #国哥，我爱你

            divObj.appendChild(textNodeObj); // <div>国哥，我爱你</div>

            // divObj.innerHTML = "国哥，我爱你"; // <div>国哥，我爱你</div>,但，还只是在内存中
            // 添加子元素
            document.body.appendChild(divObj);
        }
    </script>
</head>
<body>

</body>
</html>
```

#### 2.4.4 节点的常用属性和方法

**方法**

- 通过具体的元素节点调用 getElementsByTagName() 方法，获取当前节点的指定标签名孩子节点 
- appendChild( oChildNode ) 方法，可以添加一个子节点，oChildNode 

**属性**

- childNodes 属性，获取当前节点的所有子节点 
- firstChild 属性，获取当前节点的第一个子节点 
- lastChild 属性，获取当前节点的最后一个子节点 
- parentNode 属性，获取当前节点的父节点 
- nextSibling 属性，获取当前节点的下一个节点 
- previousSibling 属性，获取当前节点的上一个节点 
- className 用于获取或设置标签的 class 属性值 
- innerHTML 属性，表示获取/设置起始标签和结束标签中的内容
- innerText 属性，表示获取/设置起始标签和结束标签中的文本

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dom查询</title>
<link rel="stylesheet" type="text/css" href="style/css.css" />
<script type="text/javascript">
	window.onload = function(){
		//1.查找#bj节点
		document.getElementById("btn01").onclick = function () {
			var bjObj = document.getElementById("bj");
			alert(bjObj.innerHTML);
		}
		//2.查找所有li节点
		var btn02Ele = document.getElementById("btn02");
		btn02Ele.onclick = function(){
			var lis = document.getElementsByTagName("li");
			alert(lis.length)
		};
		//3.查找name=gender的所有节点
		var btn03Ele = document.getElementById("btn03");
		btn03Ele.onclick = function(){
			var genders = document.getElementsByName("gender");
			alert(genders.length)
		};
		//4.查找#city下所有li节点
		var btn04Ele = document.getElementById("btn04");
		btn04Ele.onclick = function(){
			//1 获取id为city的节点
			//2 通过city节点.getElementsByTagName按标签名查子节点
			var lis = document.getElementById("city").getElementsByTagName("li");
			alert(lis.length)
		};
		//5.返回#city的所有子节点
		var btn05Ele = document.getElementById("btn05");
		btn05Ele.onclick = function(){
			//1 获取id为city的节点
			//2 通过city获取所有子节点
			alert(document.getElementById("city").childNodes.length);
		};
		//6.返回#phone的第一个子节点
		var btn06Ele = document.getElementById("btn06");
		btn06Ele.onclick = function(){
			// 查询id为phone的节点
			alert( document.getElementById("phone").firstChild.innerHTML );
		};
		//7.返回#bj的父节点
		var btn07Ele = document.getElementById("btn07");
		btn07Ele.onclick = function(){
			//1 查询id为bj的节点
			var bjObj = document.getElementById("bj");
			//2 bj节点获取父节点
			alert( bjObj.parentNode.innerHTML );
		};
		//8.返回#android的前一个兄弟节点
		var btn08Ele = document.getElementById("btn08");
		btn08Ele.onclick = function(){
			// 获取id为android的节点
			// 通过android节点获取前面兄弟节点
			alert( document.getElementById("android").previousSibling.innerHTML );
		};
		//9.读取#username的value属性值
		var btn09Ele = document.getElementById("btn09");
		btn09Ele.onclick = function(){
			alert(document.getElementById("username").value);
		};
		//10.设置#username的value属性值
		var btn10Ele = document.getElementById("btn10");
		btn10Ele.onclick = function(){
			document.getElementById("username").value = "国哥你真牛逼";
		};
		//11.返回#bj的文本值
		var btn11Ele = document.getElementById("btn11");
		btn11Ele.onclick = function(){
			alert(document.getElementById("city").innerHTML);
			// alert(document.getElementById("city").innerText);
		};
	};
</script>
</head>
<body>
<div id="total">
	<div class="inner">
		<p>
			你喜欢哪个城市?
		</p>

		<ul id="city">
			<li id="bj">北京</li>
			<li>上海</li>
			<li>东京</li>
			<li>首尔</li>
		</ul>

		<br>
		<br>

		<p>
			你喜欢哪款单机游戏?
		</p>

		<ul id="game">
			<li id="rl">红警</li>
			<li>实况</li>
			<li>极品飞车</li>
			<li>魔兽</li>
		</ul>

		<br />
		<br />

		<p>
			你手机的操作系统是?
		</p>

		<ul id="phone"><li>IOS</li><li id="android">Android</li><li>Windows Phone</li></ul>
	</div>

	<div class="inner">
		gender:
		<input type="radio" name="gender" value="male"/>
		Male
		<input type="radio" name="gender" value="female"/>
		Female
		<br>
		<br>
		name:
		<input type="text" name="name" id="username" value="abcde"/>
	</div>
</div>
<div id="btnList">
	<div><button id="btn01">查找#bj节点</button></div>
	<div><button id="btn02">查找所有li节点</button></div>
	<div><button id="btn03">查找name=gender的所有节点</button></div>
	<div><button id="btn04">查找#city下所有li节点</button></div>
	<div><button id="btn05">返回#city的所有子节点</button></div>
	<div><button id="btn06">返回#phone的第一个子节点</button></div>
	<div><button id="btn07">返回#bj的父节点</button></div>
	<div><button id="btn08">返回#android的前一个兄弟节点</button></div>
	<div><button id="btn09">返回#username的value属性值</button></div>
	<div><button id="btn10">设置#username的value属性值</button></div>
	<div><button id="btn11">返回#bj的文本值</button></div>
</div>
</body>
</html>
```

## 第三章  jQury

### 3. 1 jQuery 介绍 

#### 3.1.1 什么是 jQuery ?

 jQuery，顾名思义，也就是 JavaScript 和查询（Query），它就是辅助 JavaScript 开发的 js 类库。 

#### 3.1.2 jQuery 核心思想

它的核心思想是 write less,do more(写得更少,做得更多)，所以它实现了很多浏览器的兼容问题。

### 3.2  jQuery 初体验

```html
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="../script/jquery-1.7.2.js"></script>
	<script type="text/javascript">
		// window.onload = function () {
		// 	var btnObj = document.getElementById("btnId");
		// 	// alert(btnObj);//[object HTMLButtonElement]   ====>>>  dom对象
		// 	btnObj.onclick = function () {
		// 		alert("js 原生的单击事件");
		// 	}
		// }

		$(function () { // 表示页面加载完成 之后，相当 window.onload = function () {}
			var $btnObj = $("#btnId"); // 表示按id查询标签对象
			$btnObj.click(function () { // 绑定单击事件
				alert("jQuery 的单击事件");
			});
		});

	</script>



</head>
<body>
	<button id="btnId">SayHello</button>
</body>
</html>
```

### 3.3 jQury核心函数

- **$ 是 jQuery 的核心函数**，能完成 jQuery 的很多功能。$()就是调用$这个函数 

1. 传入参数为 [ 函数 ] 时： 表示页面加载完成之后。相当于 window.onload = function(){} 

2. 传入参数为 [ HTML 字符串 ] 时： 会对我们创建这个 html 标签对象 

3. 传入参数为 [ 选择器字符串 ] 时： 

   $(“#id 属性值”) :  id 选择器，根据 id 查询标签对象 

   $(“标签名”) : 标签名选择器，根据指定的标签名查询标签对象 

   $(“.class 属性值”) : 类型选择器，可以根据 class 属性查询标签对象 

4. 传入参数为 [ DOM 对象 ] 时 : 会把这个 dom 对象转换为 jQuery 对

### 3.4 jQuery 对象和 dom 对象区分 

#### 3.4.1、什么是 jQuery 对象，什么是 dom 对象 

##### Dom 对象 

1. 通过 getElementById()查询出来的标签对象是 Dom 对象 

2. 通过 getElementsByName()查询出来的标签对象是 Dom 对象

3. 通过 getElementsByTagName()查询出来的标签对象是 Dom 对象

4. 通过 createElement() 方法创建的对象，是 Dom 对象 

   DOM 对象 Alert 出来的效果是：[object HTML 标签名 Element] 

##### jQuery 对象 

5. 通过 JQuery 提供的 API 创建的对象，是 JQuery 对象 

6. 通过 JQuery 包装的 Dom 对象，也是 JQuery 对象 

7. 通过 JQuery 提供的 API 查询到的对象，是 JQuery 对象 

   jQuery 对象 Alert 出来的效果是：[object Object]

#### 3.4.2 问题：jQuery 对象的本质是什么？ 

**jQuery 对象是 dom 对象的数组 + jQuery 提供的一系列功能函数。**

#### 3.4.3、jQuery 对象和 Dom 对象使用区别 

jQuery 对象不能使用 DOM 对象的属性和方法 

DOM 对象也不能使用 jQuery 对象的属性和方法 

#### 3.4.4 Dom 对象和 jQuery 对象互转 

##### 1、dom 对象转化为 jQuery 对象

1. 先有 DOM 对象 

2. $( DOM 对象 ) 就可以转换成为 jQuery 对象 

##### 2、jQuery 对象转为 dom 对象

1. 先有 jQuery 对象
2. jQuery 对象[下标]取出相应的 DOM 对象

### 3.5  jQuery选择器

#### 3.5.1.基本选择器

- \#ID 选择器：根据 id 查找标签对象 
- .class 选择器：根据 class 查找标签对象 
- element 选择器：根据标签名查找标签对象 
- *选择器：表示任意的，所有的元素 
- selector1，selector2 组合选择器：合并选择器 1，选择器 2 的结果并返回

```html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Untitled Document</title>
		<style type="text/css">
			div, span, p {
			    width: 140px;
			    height: 140px;
			    margin: 5px;
			    background: #aaa;
			    border: #000 1px solid;
			    float: left;
			    font-size: 17px;
			    font-family: Verdana;
			}
			
			div.mini {
			    width: 55px;
			    height: 55px;
			    background-color: #aaa;
			    font-size: 12px;
			}
			
			div.hide {
			    display: none;
			}
		</style>
		<script type="text/javascript" src="../script/jquery-1.7.2.js"></script>
		<script type="text/javascript">
			
				$(function () {
					//1.选择 id 为 one 的元素 "background-color","#bbffaa"
					$("#btn1").click(function () {
						// css() 方法 可以设置和获取样式
						$("#one").css("background-color","#bbffaa");
					});


					//2.选择 class 为 mini 的所有元素
					$("#btn2").click(function () {
						$(".mini").css("background-color","#bbffaa");
					});

					//3.选择 元素名是 div 的所有元素
					$("#btn3").click(function () {
						$("div").css("background-color","#bbffaa");
					});

					//4.选择所有的元素
					$("#btn4").click(function () {
						$("*").css("background-color","#bbffaa");
					});

					//5.选择所有的 span 元素和id为two的元素
					$("#btn5").click(function () {
						$("span,#two").css("background-color","#bbffaa");
					});

				});

		</script>
	</head>
	<body>
<!-- 	<div>
		<h1>基本选择器</h1>
	</div>	 -->	
		<input type="button" value="选择 id 为 one 的元素" id="btn1" />
		<input type="button" value="选择 class 为 mini 的所有元素" id="btn2" />
		<input type="button" value="选择 元素名是 div 的所有元素" id="btn3" />
		<input type="button" value="选择 所有的元素" id="btn4" />
		<input type="button" value="选择 所有的 span 元素和id为two的元素" id="btn5" />
		
		<br>
		<div class="one" id="one">
			id 为 one,class 为 one 的div
			<div class="mini">class为mini</div>
		</div>
		<div class="one" id="two" title="test">
			id为two,class为one,title为test的div
			<div class="mini" title="other">class为mini,title为other</div>
			<div class="mini" title="test">class为mini,title为test</div>
		</div>
		<div class="one">
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini"></div>
		</div>
		<div class="one">
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini" title="tesst">class为mini,title为tesst</div>
		</div>
		<div style="display:none;" class="none">style的display为"none"的div</div>
		<div class="hide">class为"hide"的div</div>
		<div>
			包含input的type为"hidden"的div<input type="hidden" size="8">
		</div>
		<span class="one" id="span">^^span元素^^</span>
	</body>
</html>


```



#### 3.5.2 层级选择器

- ancestor descendant  后代选择器 ：在给定的祖先元素下匹配所有的后代元素 
- parent > child 子元素选择器：在给定的父元素下匹配所有的子元素 
- prev + next 相邻元素选择器：匹配所有紧接在 prev 元素后的 next 元素 
- prev ~ sibings 之后的兄弟元素选择器：匹配

```html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Untitled Document</title>
		<style type="text/css">
			div, span, p {
			    width: 140px;
			    height: 140px;
			    margin: 5px;
			    background: #aaa;
			    border: #000 1px solid;
			    float: left;
			    font-size: 17px;
			    font-family: Verdana;
			}
			
			div.mini {
			    width: 55px;
			    height: 55px;
			    background-color: #aaa;
			    font-size: 12px;
			}
			
			div.hide {
			    display: none;
			}			
		</style>
		<script type="text/javascript" src="../script/jquery-1.7.2.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				//1.选择 body 内的所有 div 元素
				$("#btn1").click(function(){
					$("body div").css("background", "#bbffaa");
				});

				//2.在 body 内, 选择div子元素  
				$("#btn2").click(function(){
					$("body > div").css("background", "#bbffaa");
				});

				//3.选择 id 为 one 的下一个 div 元素 
				$("#btn3").click(function(){
					$("#one+div").css("background", "#bbffaa");
				});

				//4.选择 id 为 two 的元素后面的所有 div 兄弟元素
				$("#btn4").click(function(){
					$("#two~div").css("background", "#bbffaa");
				});
			});
		</script>
	</head>
	<body>	
	
<!-- 	<div>
		<h1>层级选择器:根据元素的层级关系选择元素</h1>
		ancestor descendant  ：
		parent > child 		   ：
		prev + next 		   ：
		prev ~ siblings 	   ：
	</div>	 -->
		<input type="button" value="选择 body 内的所有 div 元素" id="btn1" />
		<input type="button" value="在 body 内, 选择div子元素" id="btn2" />
		<input type="button" value="选择 id 为 one 的下一个 div 元素" id="btn3" />
		<input type="button" value="选择 id 为 two 的元素后面的所有 div 兄弟元素" id="btn4" />
		<br><br>
		<div class="one" id="one">
			id 为 one,class 为 one 的div
			<div class="mini">class为mini</div>
		</div>
		<div class="one" id="two" title="test">
			id为two,class为one,title为test的div
			<div class="mini" title="other">class为mini,title为other</div>
			<div class="mini" title="test">class为mini,title为test</div>
		</div>
		<div class="one">
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini"></div>
		</div>
		<div class="one">
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini" title="tesst">class为mini,title为tesst</div>
		</div>
		<div style="display:none;" class="none">style的display为"none"的div</div>
		<div class="hide">class为"hide"的div</div>
		<div>
			包含input的type为"hidden"的div<input type="hidden" size="8">
		</div>
		<span id="span">^^span元素^^</span>
	</body>
</html>


```

#### 3.5.3 过滤选择器 

##### 基本过滤器：

- :first 获取第一个元素 

- :last 获取最后个元素 
- :not(selector) 去除所有与给定选择器匹配的元素 
- :even 匹配所有索引值为偶数的元素，从 0 开始计数 
- :odd 匹配所有索引值为奇数的元素，从 0 开始计数 
- :eq(index) 匹配一个给定索引值的元素 
- :gt(index) 匹配所有大于给定索引值的元素 
- :lt(index) 匹配所有小于给定索引值的元素 
- :header 匹配如 h1, h2, h3 之类的标题元素 
- :animated 匹配所有正在执行动画效果的元素

```html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Untitled Document</title>
		<style type="text/css">
			div, span, p {
			    width: 140px;
			    height: 140px;
			    margin: 5px;
			    background: #aaa;
			    border: #000 1px solid;
			    float: left;
			    font-size: 17px;
			    font-family: Verdana;
			}
			
			div.mini {
			    width: 55px;
			    height: 55px;
			    background-color: #aaa;
			    font-size: 12px;
			}
			
			div.hide {
			    display: none;
			}			
		</style>
		<script type="text/javascript" src="../script/jquery-1.7.2.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				function anmateIt(){
					$("#mover").slideToggle("slow", anmateIt);
				}
				anmateIt();
			});
			
			$(document).ready(function(){
				//1.选择第一个 div 元素  
				$("#btn1").click(function(){
					$("div:first").css("background", "#bbffaa");
				});

				//2.选择最后一个 div 元素
				$("#btn2").click(function(){
					$("div:last").css("background", "#bbffaa");
				});

				//3.选择class不为 one 的所有 div 元素
				$("#btn3").click(function(){
					$("div:not(.one)").css("background", "#bbffaa");
				});

				//4.选择索引值为偶数的 div 元素
				$("#btn4").click(function(){
					$("div:even").css("background", "#bbffaa");
				});

				//5.选择索引值为奇数的 div 元素
				$("#btn5").click(function(){
					$("div:odd").css("background", "#bbffaa");
				});

				//6.选择索引值为大于 3 的 div 元素
				$("#btn6").click(function(){
					$("div:gt(3)").css("background", "#bbffaa");
				});

				//7.选择索引值为等于 3 的 div 元素
				$("#btn7").click(function(){
					$("div:eq(3)").css("background", "#bbffaa");
				});

				//8.选择索引值为小于 3 的 div 元素
				$("#btn8").click(function(){
					$("div:lt(3)").css("background", "#bbffaa");
				});

				//9.选择所有的标题元素
				$("#btn9").click(function(){
					$(":header").css("background", "#bbffaa");
				});

				//10.选择当前正在执行动画的所有元素
				$("#btn10").click(function(){
					$(":animated").css("background", "#bbffaa");
				});
				//11.选择没有执行动画的最后一个div
				$("#btn11").click(function(){
					$("div:not(:animated):last").css("background", "#bbffaa");
				});
			});
		</script>
	</head>
	<body>
		<input type="button" value="选择第一个 div 元素" id="btn1" />
		<input type="button" value="选择最后一个 div 元素" id="btn2" />
		<input type="button" value="选择class不为 one 的所有 div 元素" id="btn3" />
		<input type="button" value="选择索引值为偶数的 div 元素" id="btn4" />
		<input type="button" value="选择索引值为奇数的 div 元素" id="btn5" />
		<input type="button" value="选择索引值为大于 3 的 div 元素" id="btn6" />
		<input type="button" value="选择索引值为等于 3 的 div 元素" id="btn7" />
		<input type="button" value="选择索引值为小于 3 的 div 元素" id="btn8" />
		<input type="button" value="选择所有的标题元素" id="btn9" />
		<input type="button" value="选择当前正在执行动画的所有元素" id="btn10" />		
		<input type="button" value="选择没有执行动画的最后一个div" id="btn11" />


		<h3>基本选择器.</h3>
		<br><br>
		<div class="one" id="one">
			id 为 one,class 为 one 的div
			<div class="mini">class为mini</div>
		</div>
		<div class="one" id="two" title="test">
			id为two,class为one,title为test的div
			<div class="mini" title="other">class为mini,title为other</div>
			<div class="mini" title="test">class为mini,title为test</div>
		</div>
		<div class="one">
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini"></div>
		</div>
		<div class="one">
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini" title="tesst">class为mini,title为tesst</div>
		</div>
		<div style="display:none;" class="none">style的display为"none"的div</div>
		<div class="hide">class为"hide"的div</div>
		<div>
			包含input的type为"hidden"的div<input type="hidden" size="8">
		</div>
		<div id="mover">正在执行动画的div元素.</div>
	</body>
</html>
```

##### 内容过滤器

- :contains(text) 匹配包含给定文本的元素 
- :empty 匹配所有不包含子元素或者文本的空元素 
- :parent 匹配含有子元素或者文本的元素 
- :has(selector) 匹配含有选择器所匹配的元素的元素

```html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Untitled Document</title>
		<style type="text/css">
			div, span, p {
			    width: 140px;
			    height: 140px;
			    margin: 5px;
			    background: #aaa;
			    border: #000 1px solid;
			    float: left;
			    font-size: 17px;
			    font-family: Verdana;
			}
			
			div.mini {
			    width: 55px;
			    height: 55px;
			    background-color: #aaa;
			    font-size: 12px;
			}
			
			div.hide {
			    display: none;
			}			
		</style>
		<script type="text/javascript" src="../script/jquery-1.7.2.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				function anmateIt(){
					$("#mover").slideToggle("slow", anmateIt);
				}
	
				anmateIt();				
			});
			
			/** 
			:contains(text)   
			:empty 			  
			:has(selector) 	
			:parent 			
			*/
			$(document).ready(function(){
				//1.选择 含有文本 'di' 的 div 元素
				$("#btn1").click(function(){
					$("div:contains('di')").css("background", "#bbffaa");
				});

				//2.选择不包含子元素(或者文本元素) 的 div 空元素
				$("#btn2").click(function(){
					$("div:empty").css("background", "#bbffaa");
				});

				//3.选择含有 class 为 mini 元素的 div 元素
				$("#btn3").click(function(){
					$("div:has(.mini)").css("background", "#bbffaa");
				});

				//4.选择含有子元素(或者文本元素)的div元素
				$("#btn4").click(function(){
					$("div:parent").css("background", "#bbffaa");
				});
			});
		</script>
	</head>
	<body>		
		<input type="button" value="选择 含有文本 'di' 的 div 元素" id="btn1" />
		<input type="button" value="选择不包含子元素(或者文本元素) 的 div 空元素" id="btn2" />
		<input type="button" value="选择含有 class 为 mini 元素的 div 元素" id="btn3" />
		<input type="button" value="选择含有子元素(或者文本元素)的div元素" id="btn4" />
		
		<br><br>
		<div class="one" id="one">
			id 为 one,class 为 one 的div
			<div class="mini">class为mini</div>
		</div>
		<div class="one" id="two" title="test">
			id为two,class为one,title为test的div
			<div class="mini" title="other">class为mini,title为other</div>
			<div class="mini" title="test">class为mini,title为test</div>
		</div>
		<div class="one">
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini"></div>
		</div>
		<div class="one">
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini" title="tesst">class为mini,title为tesst</div>
		</div>
		<div style="display:none;" class="none">style的display为"none"的div</div>
		<div class="hide">class为"hide"的div</div>
		<div>
			包含input的type为"hidden"的div<input type="hidden" size="8">
		</div>
		<div id="mover">正在执行动画的div元素.</div>
	</body>
</html>

```
##### 属性过滤器

- :contains(text) 匹配包含给定文本的元素 
- :empty 匹配所有不包含子元素或者文本的空元素 
- :parent 匹配含有子元素或者文本的元素 
- :has(selector) 匹配含有选择器所匹配的元素的元素
```html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Untitled Document</title>
<style type="text/css">
div,span,p {
	width: 140px;
	height: 140px;
	margin: 5px;
	background: #aaa;
	border: #000 1px solid;
	float: left;
	font-size: 17px;
	font-family: Verdana;
}

div.mini {
	width: 55px;
	height: 55px;
	background-color: #aaa;
	font-size: 12px;
}

div.hide {
	display: none;
}
</style>
<script type="text/javascript" src="../script/jquery-1.7.2.js"></script>
<script type="text/javascript">
	/**
[attribute] 			
[attribute=value] 		
[attribute!=value] 		 
[attribute^=value] 		
[attribute$=value] 		
[attribute*=value] 		
[attrSel1][attrSel2][attrSelN]  
	
	
	*/
	$(function() {
		//1.选取含有 属性title 的div元素
		$("#btn1").click(function() {
			$("div[title]").css("background", "#bbffaa");
		});
		//2.选取 属性title值等于'test'的div元素
		$("#btn2").click(function() {
			$("div[title='test']").css("background", "#bbffaa");
		});
		//3.选取 属性title值不等于'test'的div元素(*没有属性title的也将被选中)
		$("#btn3").click(function() {
			$("div[title!='test']").css("background", "#bbffaa");
		});
		//4.选取 属性title值 以'te'开始 的div元素
		$("#btn4").click(function() {
			$("div[title^='te']").css("background", "#bbffaa");
		});
		//5.选取 属性title值 以'est'结束 的div元素
		$("#btn5").click(function() {
			$("div[title$='est']").css("background", "#bbffaa");
		});
		//6.选取 属性title值 含有'es'的div元素
		$("#btn6").click(function() {
			$("div[title*='es']").css("background", "#bbffaa");
		});
		
		//7.首先选取有属性id的div元素，然后在结果中 选取属性title值 含有'es'的 div 元素
		$("#btn7").click(function() {
			$("div[id][title*='es']").css("background", "#bbffaa");
		});
		//8.选取 含有 title 属性值, 且title 属性值不等于 test 的 div 元素
		$("#btn8").click(function() {
			$("div[title][title!='test']").css("background", "#bbffaa");
		});
	});
</script>
</head>
<body>
	<input type="button" value="选取含有 属性title 的div元素." id="btn1" style="display: none;"/>
	<input type="button" value="选取 属性title值等于'test'的div元素." id="btn2" />
	<input type="button"
		value="选取 属性title值不等于'test'的div元素(没有属性title的也将被选中)." id="btn3" />
	<input type="button" value="选取 属性title值 以'te'开始 的div元素." id="btn4" />
	<input type="button" value="选取 属性title值 以'est'结束 的div元素." id="btn5" />
	<input type="button" value="选取 属性title值 含有'es'的div元素." id="btn6" />
	<input type="button"
		value="组合属性选择器,首先选取有属性id的div元素，然后在结果中 选取属性title值 含有'es'的 div 元素."
		id="btn7" />
	<input type="button"
		value="选取 含有 title 属性值, 且title 属性值不等于 test 的 div 元素." id="btn8" />

	<br>
	<br>
	<div class="one" id="one">
		id 为 one,class 为 one 的div
		<div class="mini">class为mini</div>
	</div>
	<div class="one" id="two" title="test">
		id为two,class为one,title为test的div
		<div class="mini" title="other">class为mini,title为other</div>
		<div class="mini" title="test">class为mini,title为test</div>
	</div>
	<div class="one">
		<div class="mini">class为mini</div>
		<div class="mini">class为mini</div>
		<div class="mini">class为mini</div>
		<div class="mini"></div>
	</div>
	<div class="one">
		<div class="mini">class为mini</div>
		<div class="mini">class为mini</div>
		<div class="mini">class为mini</div>
		<div class="mini" title="tesst">class为mini,title为tesst</div>
	</div>
	<div style="display: none;" class="none">style的display为"none"的div</div>
	<div class="hide">class为"hide"的div</div>
	<div>
		包含input的type为"hidden"的div<input type="hidden" value="123456789"
			size="8">
	</div>
	<div id="mover">正在执行动画的div元素.</div>
</body>
</html>


```
##### 表单过滤器:

- :input 匹配所有 input, textarea, select 和 button 元素 
- :text 匹配所有 文本输入框 
- :password 匹配所有的密码输入框 
- :radio 匹配所有的单选框 
- :checkbox 匹配所有的复选框 
- :submit 匹配所有提交按钮 
- :image 匹配所有 img 标签 
- :reset 匹配所有重置按钮
- :button 匹配所有 input type=button 按钮 
- :file 匹配所有 input type=file 文件上传 
- :hidden 匹配所有不可见元素 display:none 或 input type=hidden

##### 表单对象属性过滤器

- :enabled 匹配所有可用元素 
- :disabled 匹配所有不可用元素 
- :checked 匹配所有选中的单选，复选，和下拉列表中选中的 option 标签对象 
- :selected 匹配所有选中的 option
```html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Untitled Document</title>
		<script type="text/javascript" src="../script/jquery-1.7.2.js"></script>
		<script type="text/javascript">
			$(function(){
				
				
		/**
		:input 		
		:text 		
		:password 	
		:radio 		
		:checkbox 	
		:submit 	
		:image 		
		:reset 		
		:button 	
		:file 		
		:hidden 	
		
		表单对象的属性
		:enabled 		
		:disabled 		
		:checked 		
		:selected 		
		*/

					
				//1.对表单内 可用input 赋值操作
				$("#btn1").click(function(){
					// val()可以操作表单项的value属性值
					// 它可以设置和获取
					$(":text:enabled").val("我是万能的程序员");
				});
				//2.对表单内 不可用input 赋值操作
				$("#btn2").click(function(){
					$(":text:disabled").val("管你可用不可用，反正我是万能的程序员");
				});
				//3.获取多选框选中的个数  使用size()方法获取选取到的元素集合的元素个数
				$("#btn3").click(function(){
					alert( $(":checkbox:checked").length );
				});
				//4.获取多选框，每个选中的value值
				$("#btn4").click(function(){
					// 获取全部选中的复选框标签对象
					var $checkboies = $(":checkbox:checked");
					// 老式遍历
					// for (var i = 0; i < $checkboies.length; i++){
					// 	alert( $checkboies[i].value );
					// }

					// each方法是jQuery对象提供用来遍历元素的方法
					// 在遍历的function函数中，有一个this对象，这个this对象，就是当前遍历到的dom对象
					$checkboies.each(function () {
						alert( this.value );
					});

				});
				//5.获取下拉框选中的内容  
				$("#btn5").click(function(){
					// 获取选中的option标签对象
					var $options = $("select option:selected");
					// 遍历，获取option标签中的文本内容
					$options.each(function () {
						// 在each遍历的function函数中，有一个this对象。这个this对象是当前正在遍历到的dom对象
						alert(this.innerHTML);
					});
				});
			})	
		</script>
	</head>
	<body>
		<h3>表单对象属性过滤选择器</h3>
		 <button id="btn1">对表单内 可用input 赋值操作.</button>
  		 <button id="btn2">对表单内 不可用input 赋值操作.</button><br /><br />
		 <button id="btn3">获取多选框选中的个数.</button>
		 <button id="btn4">获取多选框选中的内容.</button><br /><br />
         <button id="btn5">获取下拉框选中的内容.</button><br /><br />
		 
		<form id="form1" action="#">			
			可用元素: <input name="add" value="可用文本框1"/><br>
			不可用元素: <input name="email" disabled="disabled" value="不可用文本框"/><br>
			可用元素: <input name="che" value="可用文本框2"/><br>
			不可用元素: <input name="name" disabled="disabled" value="不可用文本框"/><br>
			<br>
			
			多选框: <br>
			<input type="checkbox" name="newsletter" checked="checked" value="test1" />test1
			<input type="checkbox" name="newsletter" value="test2" />test2
			<input type="checkbox" name="newsletter" value="test3" />test3
			<input type="checkbox" name="newsletter" checked="checked" value="test4" />test4
			<input type="checkbox" name="newsletter" value="test5" />test5
			
			<br><br>
			下拉列表1: <br>
			<select name="test" multiple="multiple" style="height: 100px" id="sele1">
				<option>浙江</option>
				<option selected="selected">辽宁</option>
				<option>北京</option>
				<option selected="selected">天津</option>
				<option>广州</option>
				<option>湖北</option>
			</select>
			
			<br><br>
			下拉列表2: <br>
			<select name="test2">
				<option>浙江</option>
				<option>辽宁</option>
				<option selected="selected">北京</option>
				<option>天津</option>
				<option>广州</option>
				<option>湖北</option>
			</select>
		</form>		
	</body>
</html>
```
### 3.6 jQuery 元素筛选

|      |      |      |
| ---- | ---- | ---- |
|eq()| 获取给定索引的元素 |功能跟 :eq() 一样 |
|first()| 获取第一个元素 |功能跟 :first 一样 |
|last()| 获取最后一个元素 |功能跟 :last 一样 |
|filter(exp)| 留下匹配的元素 |
|is(exp) |判断是否匹配给定的选择器，只要有一个匹配就返回，true |
|has(exp) |返回包含有匹配选择器的元素的元素 |功能跟 :has 一样 |
|not(exp)| 删除匹配选择器的元素| 功能跟 :not 一样 |
|children(exp)| 返回匹配给定选择器的子元素 |功能跟 parent>child 一样 |
|find(exp)| 返回匹配给定选择器的后代元素 |功能跟 ancestor descendant 一样 |
|next() |返回当前元素的下一个兄弟元素 |功能跟 prev + next 功能一样 |
|nextAll()| 返回当前元素后面所有的兄弟元素 |功能跟 prev ~ siblings 功能一样 |
|nextUntil() |返回当前元素到指定匹配的元素为止的后面元素 |
|parent()| 返回父元素 prev(exp) 返回当前元素的上一个兄弟元素 |
|prevAll()| 返回当前元素前面所有的兄弟元素 |
|prevUnit(exp)|返回当前元素到指定匹配的元素为止的前面元素 |
|siblings(exp)| 返回所有兄弟元素 |
|add()| 把 add 匹配的选择器的元素添加到当前 jquery 对象|
```html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>DOM查询</title>
		<style type="text/css">
			div, span, p {
			    width: 140px;
			    height: 140px;
			    margin: 5px;
			    background: #aaa;
			    border: #000 1px solid;
			    float: left;
			    font-size: 17px;
			    font-family: Verdana;
			}
			
			div.mini {
			    width: 55px;
			    height: 55px;
			    background-color: #aaa;
			    font-size: 12px;
			}
			
			div.hide {
			    display: none;
			}			
		</style>
		<script type="text/javascript" src="../script/jquery-1.7.2.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				function anmateIt(){
					$("#mover").slideToggle("slow", anmateIt);
				}
				anmateIt();
				
	/**
					
	过滤
	eq(index|-index) 			
	first() 					
	last() 						
	hasClass(class) 			
	filter(expr|obj|ele|fn) 	
	is(expr|obj|ele|fn)1.6* 	
	has(expr|ele) 				
	not(expr|ele|fn) 			
	slice(start,[end]) 			
	
	查找
	children([expr]) 			
	closest(expr,[con]|obj|ele)1.6*   
	find(expr|obj|ele) 				
	next([expr]) 					
	nextall([expr]) 				
	nextUntil([exp|ele][,fil])1.6* 	
	parent([expr]) 					
	parents([expr]) 				
	parentsUntil([exp|ele][,fil])1.6*  
	prev([expr]) 					
	prevall([expr]) 				
	prevUntil([exp|ele][,fil])1.6* 	
	siblings([expr]) 				
	
	串联
	add(expr|ele|html|obj[,con]) 	
							
	
	*/
				
				//(1)eq()  选择索引值为等于 3 的 div 元素
				$("#btn1").click(function(){
					$("div").eq(3).css("background-color","#bfa");
				});
				//(2)first()选择第一个 div 元素
				 $("#btn2").click(function(){
					 //first()   选取第一个元素
					$("div").first().css("background-color","#bfa");
				});
				//(3)last()选择最后一个 div 元素
				$("#btn3").click(function(){
					//last()  选取最后一个元素
					$("div").last().css("background-color","#bfa");
				});
				//(4)filter()在div中选择索引为偶数的
				$("#btn4").click(function(){
					//filter()  过滤   传入的是选择器字符串
					$("div").filter(":even").css("background-color","#bfa");
				});
				 //(5)is()判断#one是否为:empty或:parent
				//is用来检测jq对象是否符合指定的选择器
				$("#btn5").click(function(){
					alert( $("#one").is(":empty") );
				});
				
				//(6)has()选择div中包含.mini的
				$("#btn6").click(function(){
					//has(selector)  选择器字符串    是否包含selector
					$("div").has(".mini").css("background-color","#bfa");
				});
				//(7)not()选择div中class不为one的
				$("#btn7").click(function(){
					//not(selector)  选择不是selector的元素
					$("div").not('.one').css("background-color","#bfa");
				});
				//(8)children()在body中选择所有class为one的div子元素
				$("#btn8").click(function(){
					//children()  选出所有的子元素
					$("body").children("div.one").css("background-color","#bfa");
				});
				
				
				//(9)find()在body中选择所有class为mini的div元素
				$("#btn9").click(function(){
					//find()  选出所有的后代元素
					$("body").find("div.mini").css("background-color","#bfa");
				});
				//(10)next() #one的下一个div
				$("#btn10").click(function(){
					//next()  选择下一个兄弟元素
					$("#one").next("div").css("background-color","#bfa");
				});
				//(11)nextAll() #one后面所有的span元素
				$("#btn11").click(function(){
					//nextAll()   选出后面所有的元素
					$("#one").nextAll("span").css("background-color","#bfa");
				});
				//(12)nextUntil() #one和span之间的元素
				$("#btn12").click(function(){
					//
					$("#one").nextUntil("span").css("background-color","#bfa")
				});
				//(13)parent() .mini的父元素
				$("#btn13").click(function(){
					$(".mini").parent().css("background-color","#bfa");
				});
				//(14)prev() #two的上一个div
				$("#btn14").click(function(){
					//prev()  
					$("#two").prev("div").css("background-color","#bfa")
				});
				//(15)prevAll() span前面所有的div
				$("#btn15").click(function(){
					//prevAll()   选出前面所有的元素
					$("span").prevAll("div").css("background-color","#bfa")
				});
				//(16)prevUntil() span向前直到#one的元素
				$("#btn16").click(function(){
					//prevUntil(exp)   找到之前所有的兄弟元素直到找到exp停止
					$("span").prevUntil("#one").css("background-color","#bfa")
				});
				//(17)siblings() #two的所有兄弟元素
				$("#btn17").click(function(){
					//siblings()    找到所有的兄弟元素，包括前面的和后面的
					$("#two").siblings().css("background-color","#bfa")
				});
				
				
				//(18)add()选择所有的 span 元素和id为two的元素
				$("#btn18").click(function(){
	
					//   $("span,#two,.mini,#one")
					$("span").add("#two").add("#one").css("background-color","#bfa");
					
				});
				


			});
			
			
		</script>
	</head>
	<body>		
		<input type="button" value="eq()选择索引值为等于 3 的 div 元素" id="btn1" />
		<input type="button" value="first()选择第一个 div 元素" id="btn2" />
		<input type="button" value="last()选择最后一个 div 元素" id="btn3" />
		<input type="button" value="filter()在div中选择索引为偶数的" id="btn4" />
		<input type="button" value="is()判断#one是否为:empty或:parent" id="btn5" />
		<input type="button" value="has()选择div中包含.mini的" id="btn6" />
		<input type="button" value="not()选择div中class不为one的" id="btn7" />
		<input type="button" value="children()在body中选择所有class为one的div子元素" id="btn8" />
		<input type="button" value="find()在body中选择所有class为mini的div后代元素" id="btn9" />
		<input type="button" value="next()#one的下一个div" id="btn10" />
		<input type="button" value="nextAll()#one后面所有的span元素" id="btn11" />
		<input type="button" value="nextUntil()#one和span之间的元素" id="btn12" />
		<input type="button" value="parent().mini的父元素" id="btn13" />
		<input type="button" value="prev()#two的上一个div" id="btn14" />
		<input type="button" value="prevAll()span前面所有的div" id="btn15" />
		<input type="button" value="prevUntil()span向前直到#one的元素" id="btn16" />
		<input type="button" value="siblings()#two的所有兄弟元素" id="btn17" />
		<input type="button" value="add()选择所有的 span 元素和id为two的元素" id="btn18" />

		
		<h3>基本选择器.</h3>
		<br /><br />
		文本框<input type="text" name="account" disabled="disabled" />
		<br><br>
		<div class="one" id="one">
			id 为 one,class 为 one 的div
			<div class="mini">class为mini</div>
		</div>
		<div class="one" id="two" title="test">
			id为two,class为one,title为test的div
			<div class="mini" title="other"><b>class为mini,title为other</b></div>
			<div class="mini" title="test">class为mini,title为test</div>
		</div>
		
		<div class="one">
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini"></div>
		</div>
		<div class="one">
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini">class为mini</div>
			<div class="mini" title="tesst">class为mini,title为tesst</div>
		</div>
		<div style="display:none;" class="none">style的display为"none"的div</div>
		<div class="hide">class为"hide"的div</div>
		<span id="span1">^^span元素 111^^</span>
		<div>
			包含input的type为"hidden"的div<input type="hidden" size="8">
		</div>
		<span id="span2">^^span元素 222^^</span>
		<div id="mover">正在执行动画的div元素.</div>
	</body>
</html>

```

## 第四章  jQury

### 4.1 jQuery 的属性操作 

- html() 它可以设置和获取起始标签和结束标签中的内容。 跟 dom 属性 innerHTML 一样。 
- text() 它可以设置和获取起始标签和结束标签中的文本。 跟 dom 属性 innerText 一样。 
- val() 它可以设置和获取表单项的 value 属性值。 跟 dom 属性 value 一样
- attr() 可以设置和获取属性的值，不推荐操作 checked、readOnly、selected、disabled 等等。attr 方法还可以操作非标准的属性。比如自定义属性：abc,bbj 
- prop() 可以设置和获取属性的值,只推荐操作 checked、readOnly、selected、disabled 等等

### 4.2 jQuery 练习

#### 全选，全不选，反选

```html
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../../script/jquery-1.7.2.js"></script>
<script type="text/javascript">
	
	$(function(){
		// 给全选绑定单击事件
		$("#checkedAllBtn").click(function () {
			$(":checkbox").prop("checked",true);
		});

		// 给全不选绑定单击事件
		$("#checkedNoBtn").click(function () {
			$(":checkbox").prop("checked",false);
		});

		// 反选单击事件
		$("#checkedRevBtn").click(function () {
			// 查询全部的球类的复选框
			$(":checkbox[name='items']").each(function () {
				// 在each遍历的function函数中，有一个this对象。这个this对象是当前正在遍历到的dom对象
				this.checked = !this.checked;
			});

			// 要检查 是否满选
			// 获取全部的球类个数
			var allCount = $(":checkbox[name='items']").length;
			// 再获取选中的球类个数
			var checkedCount = $(":checkbox[name='items']:checked").length;

			// if (allCount == checkedCount) {
			// 	$("#checkedAllBox").prop("checked",true);
			// } else {
			// 	$("#checkedAllBox").prop("checked",false);
			// }

			$("#checkedAllBox").prop("checked",allCount == checkedCount);

		});

		// 【提交】按钮单击事件
		$("#sendBtn").click(function () {
			// 获取选中的球类的复选框
			$(":checkbox[name='items']:checked").each(function () {
				alert(this.value);
			});
		});

		// 给【全选/全不选】绑定单击事件
		$("#checkedAllBox").click(function () {

			// 在事件的function函数中，有一个this对象，这个this对象是当前正在响应事件的dom对象
			// alert(this.checked);

			$(":checkbox[name='items']").prop("checked",this.checked);
		});

		// 给全部球类绑定单击事件
		$(":checkbox[name='items']").click(function () {
			// 要检查 是否满选
			// 获取全部的球类个数
			var allCount = $(":checkbox[name='items']").length;
			// 再获取选中的球类个数
			var checkedCount = $(":checkbox[name='items']:checked").length;

			$("#checkedAllBox").prop("checked",allCount == checkedCount);
		});

	});
	
</script>
</head>
<body>

	<form method="post" action="">
	
		你爱好的运动是？<input type="checkbox" id="checkedAllBox" />全选/全不选 
		
		<br />
		<input type="checkbox" name="items" value="足球" />足球
		<input type="checkbox" name="items" value="篮球" />篮球
		<input type="checkbox" name="items" value="羽毛球" />羽毛球
		<input type="checkbox" name="items" value="乒乓球" />乒乓球
		<br />
		<input type="button" id="checkedAllBtn" value="全　选" />
		<input type="button" id="checkedNoBtn" value="全不选" />
		<input type="button" id="checkedRevBtn" value="反　选" />
		<input type="button" id="sendBtn" value="提　交" />
	</form>

</body>
</html>
```



### 4.3 DOM 的增删

|      |      |      |
| ---- | ---- | ---- |
|内部插入|
|appendTo() |a.appendTo(b) |把 a 插入到 b 子元素末尾，成为最后一个子元素|
|prependTo()| a.prependTo(b) |把 a 插到 b 所有子元素前面，成为第一个子元素|
|外部插入： |
|insertAfter()| a.insertAfter(b) |得到 ba |
|insertBefore()| a.insertBefore(b) |得到 ab |
|替换:|
|replaceWith()| a.replaceWith(b) |用 b 替换掉 a |
|replaceAll() |a.replaceAll(b) |用 a 替换掉所有 b |
|删除： |
|remove() |a.remove();|删除 a 标签 |
|empty() |a.empty(); |清空 a|

### 4.4 jQuery练习

#### 从左到右，从右到左练习

#### 动态添加、删除表格记录

### 4.5 CSS 样式操作

- addClass() 添加样式 
- removeClass() 删除样式 
- toggleClass() 有就删除，没有就添加样式
- offset() 获取和设置元素的坐标。 

### 4.6 jQuery 动画 

- 基本动画 

  - show() 将隐藏的元素显示 

  - hide() 将可见的元素隐藏。 

  - toggle() 可见就隐藏，不可见就显示。 

    以上动画方法都可以添加参数。 

    1. 第一个参数是动画 执行的时长，以毫秒为单位 
    2. 第二个参数是动画的回调函数 (动画完成后自动调用的函数) 

- 淡入淡出动画 

  - fadeIn() 淡入（慢慢可见） 
  - fadeOut() 淡出（慢慢消失） 
  - fadeTo() 在指定时长内慢慢的将透明度修改到指定的值。0 透明，1 完成可见，0.5 半透明 
  - fadeToggle() 淡入/淡出 切换

```html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Untitled Document</title>
		<link href="css/style.css" type="text/css" rel="stylesheet" />
		<script type="text/javascript" src="script/jquery-1.7.2.js"></script>
	
<script type="text/javascript">
	/* 	
		基本
		show([speed,[easing],[fn]]) 
		hide([speed,[easing],[fn]]) 
		toggle([speed],[easing],[fn]) 
		滑动
		slideDown([spe],[eas],[fn]) 
		slideUp([speed,[easing],[fn]]) 
		slideToggle([speed],[easing],[fn]) 
		淡入淡出
		fadeIn([speed],[eas],[fn]) 
		fadeOut([speed],[eas],[fn]) 
		fadeTo([[spe],opa,[eas],[fn]]) 
		fadeToggle([speed,[eas],[fn]])
		*/
		$(function(){
			//显示   show()
			$("#btn1").click(function(){
				$("#div1").show(2000,function () {
					alert("show动画完成 ")
				});
			});		
			//隐藏  hide()
			$("#btn2").click(function(){
				$("#div1").hide(1000,function () {
					alert("hide动画 执行完成 ")
				});
			});	
			//切换   toggle()
			$("#btn3").click(function(){
				$("#div1").toggle(1000,function () {
					alert("toggle动画 完成 ")
				});
			});

			// var abc = function(){
			// 	$("#div1").toggle(1000,abc);
			// }
			// abc();

			//淡入   fadeIn()
			$("#btn4").click(function(){
				$("#div1").fadeIn(2000,function () {
					alert("fadeIn完成 ")
				});
			});	
			//淡出  fadeOut()
			$("#btn5").click(function(){
				$("#div1").fadeOut(2000,function () {
					alert("fadeOut完成 ")
				});
			});	
			
			//淡化到  fadeTo()
			$("#btn6").click(function(){
				$("#div1").fadeTo(2000,0.5,function () {
					alert('fadeTo完成 ')
				});
			});	
			//淡化切换  fadeToggle()
			$("#btn7").click(function(){
				$("#div1").fadeToggle(1000,function () {
					alert("fadeToggle完成 ")
				});
			});	
		})
</script>
	
	</head>
	<body>
		<table style="float: left;">
			<tr>
				<td><button id="btn1">显示show()</button></td>
			</tr>
			<tr>
				<td><button id="btn2">隐藏hide()</button></td>
			</tr>
			<tr>
				<td><button id="btn3">显示/隐藏切换 toggle()</button></td>
			</tr>
			<tr>
				<td><button id="btn4">淡入fadeIn()</button></td>
			</tr>
			<tr>
				<td><button id="btn5">淡出fadeOut()</button></td>
			</tr>
			<tr>
				<td><button id="btn6">淡化到fadeTo()</button></td>
			</tr>
			<tr>
				<td><button id="btn7">淡化切换fadeToggle()</button></td>
			</tr>
		</table>
		
		<div id="div1" style="float:left;border: 1px solid;background-color: blue;width: 300px;height: 200px;">
			jquery动画定义了很多种动画效果，可以很方便的使用这些动画效果
		</div>
	</body>

</html>
```



**练习：品牌展示**

```html
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>品牌展示练习</title>
		<style type="text/css">
			*{ margin:0; padding:0;}
			body {font-size:12px;text-align:center;}
			a { color:#04D; text-decoration:none;}
			a:hover { color:#F50; text-decoration:underline;}
			.SubCategoryBox {width:600px; margin:0 auto; text-align:center;margin-top:40px;}
			.SubCategoryBox ul { list-style:none;}
			.SubCategoryBox ul li { display:block; float:left; width:200px; line-height:20px;}
			.showmore { clear:both; text-align:center;padding-top:10px;}
			.showmore a { display:block; width:120px; margin:0 auto; line-height:24px; border:1px solid #AAA;}
			
			.showmore a span { padding-left:15px; background:url(img/down.gif) no-repeat 0 0;}
			
			.promoted a { color:#F50;}
		</style>
		<script type="text/javascript" src="script/jquery-1.7.2.js"></script>
		<script type="text/javascript">
			$(function(){
				var category = $("ul:first li:gt(5):not(:last)");
				category.hide();
				
				var $promoptedCategory = $("ul:first li").filter(":contains('佳能'), :contains('尼康'), :contains('奥林巴斯')");
				
				$(".showmore a").click(function(){
					if(category.is(":hidden")){
						category.show();
						$promoptedCategory.addClass("promoted");
						$(".showmore a span").text("显示精简品牌")
											 .css("background", "url(img/up.gif) no-repeat 0 0");
					}else{
						category.hide();
						$promoptedCategory.removeClass("promoted");
						$(".showmore a span").text("显示全部品牌")
											 .css("background", "url(img/down.gif) no-repeat 0 0");
					}
					
					return false;
				});
			});
		</script>
	</head>
	<body>
		<div class="SubCategoryBox">
			<ul>
				<li ><a href="#">佳能</a><i>(30440) </i></li>
				<li ><a href="#">索尼</a><i>(27220) </i></li>
				<li ><a href="#">三星</a><i>(20808) </i></li>
				<li ><a href="#">尼康</a><i>(17821) </i></li>
				<li ><a href="#">松下</a><i>(12289) </i></li>
				<li ><a href="#">卡西欧</a><i>(8242) </i></li>
				<li ><a href="#">富士</a><i>(14894) </i></li>
				<li ><a href="#">柯达</a><i>(9520) </i></li>
				<li ><a href="#">宾得</a><i>(2195) </i></li>
				<li ><a href="#">理光</a><i>(4114) </i></li>
				<li ><a href="#">奥林巴斯</a><i>(12205) </i></li>
				<li ><a href="#">明基</a><i>(1466) </i></li>
				<li ><a href="#">爱国者</a><i>(3091) </i></li>
				<li ><a href="#">其它品牌相机</a><i>(7275) </i></li>
			</ul>
			<div class="showmore">
				<a href="more.html"><span>显示全部品牌</span></a>
			</div>
		</div>
	</body>
</html>


```





### 4.7 jQuery 事件操作 

**$( function(){} ); 和 window.onload = function(){} 的区别？** 

他们分别是在什么时候触发？ 

1. jQuery 的页面加载完成之后是浏览器的内核解析完页面的标签创建好 DOM 对象之后就会马上执行。 
2. 原生 js 的页面加载完成之后，除了要等浏览器内核解析完标签创建好 DOM 对象，还要等标签显示时需要的内容加载 完成。 

他们触发的顺序？

1. jQuery 页面加载完成之后先执行 
2. 原生 js 的页面加载完成之后 

他们执行的次数？

1. 原生 js 的页面加载完成之后，只会执行最后一次的赋值函数。 
2. jQuery 的页面加载完成之后是全部把注册的 function 函数，依次顺序全部执行。

#### jQuery 中其他的事件处理方法：

- click() 它可以绑定单击事件，以及触发单击事件 
- mouseover() 鼠标移入事件 
- mouseout() 鼠标移出事件 
- bind() 可以给元素一次性绑定一个或多个事件。 
- one() 使用上跟 bind 一样。但是 one 方法绑定的事件只会响应一次。 
- unbind() 跟 bind 方法相反的操作，解除事件的绑定 live() 也是用来绑定事件。它可以用来绑定选择器匹配的所有元素的事件。哪怕这个元素是后面动态创建出 来的也有效 

#### 事件的冒泡

什么是事件的冒泡？ 事件的冒泡是指，父子元素同时监听同一个事件。当触发子元素的事件的时候，同一个事件也被传递到了父元素的事件里去 响应。 那么如何阻止事件冒泡呢？ 在子元素事件函数体内，return false; 可以阻止事件的冒泡传递。 

#### javaScript 事件对象 

事件对象，是封装有触发的事件信息的一个 javascript 对象。 我们重点关心的是怎么拿到这个 javascript 的事件对象。以及使用。 如何获取呢 javascript 事件对象呢？ 在给元素绑定事件的时候，在事件的 function( event ) 参数列表中添加一个参数，这个参数名，我们习惯取名为 event。 这个 event 就是 javascript 传递参事件处理函数的事件对象。

## 第五章 XML

### 5.1 XML简介

**xml 是可扩展的标记性语言。** 

xml 的主要作用有： 

1. 用来保存数据，而且这些数据具有自我描述性 

2. 它还可以做为项目或者模块的配置文件 

3. 还可以做为网络传输数据的格式（现在 JSON 为主）。

### 3.2 XML语法

#### 3.2.1 语法： 

1. 文档声明。 

2. 元素（标签） 

3. xml 属性 

4. xml 注释 

5. 文本区域（CDATA 区）

#### 3.2.2 属性

xml 的标签属性和 html 的标签属性是非常类似的，**属性可以提供元素的额外信息** 

在标签上可以书写属性： 

- 一个标签上可以书写多个属性。**每个属性的值必须使用引号引起来**。 
- 规则和标签的书写规则一致。

### 3.3 XML解析技术——dom4j解析技术

#### 3.3.1 **dom4j** 编程步骤

第一步： 先加载 xml 文件创建 Document 对象 

第二步：通过 Document 对象拿到根元素对象 

第三步：通过根元素.elelemts(标签名); 可以返回一个集合，这个集合里放着。所有你指定的标签名的元素对象 

第四步：找到你想要修改、删除的子元素，进行相应在的操作 

第五步，保存到硬盘上

#### 3.3.2 遍历 标签 获取所有标签中的内容

需要分四步操作: 

第一步，通过创建 SAXReader 对象。来读取 xml 文件，获取 Document 对象 

第二步，通过 Document 对象。拿到 XML 的根元素对象 

第三步，通过根元素对象。获取所有的 book 标签对象 

第四小，遍历每个 book 标签对象。然后获取到 book 标签对象内的每一个元素，再通过 getText() 方法拿到起始标签和结束标签之间的文本内容 

```java
/**
 * 读取 xml 文件中的内容
 */
public class Test {

    @Test
    public void readXML() throws DocumentException {
        // 需要分四步操作: 
        // 第一步，通过创建 SAXReader 对象。来读取 xml 文件，获取 Document 对象 
        // 第二步，通过 Document 对象。拿到 XML 的根元素对象 
        // 第三步，通过根元素对象。获取所有的 book 标签对象 
        // 第四小，遍历每个 book 标签对象。然后获取到 book 标签对象内的每一个元素，再通过 getText() 方法拿到起始标签和结束标签之间的文本内容 

        // 第一步，通过创建 SAXReader 对象。来读取 xml 文件，获取 Document 对象 
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/books.xml");
        // 第二步，通过 Document 对象。拿到 XML 的根元素对象 
        Element root = document.getRootElement();
        // 打印测试 // Element.asXML() 它将当前元素转换成为 String 对象 
        // System.out.println( root.asXML() ); 
        // 第三步，通过根元素对象。获取所有的 book 标签对象 
        // Element.elements(标签名)它可以拿到当前元素下的指定的子元素的集合 
        List<Element> books = root.elements("book");
        // 第四小，遍历每个 book 标签对象。然后获取到 book 标签对象内的每一个元素， 
        for (Element book : books) {
            // 测试
            // System.out.println(book.asXML()); 
            // 拿到 book 下面的 name 元素对象 
            Element nameElement = book.element("name");
            // 拿到 book 下面的 price 元素对象 
            Element priceElement = book.element("price");
            // 拿到 book 下面的 author 元素对象 
            Element authorElement = book.element("author");
            // 再通过 getText() 方法拿到起始标签和结束标签之间的文本内容 
            System.out.println("书名" + nameElement.getText() + " , 价格:" + priceElement.getText() + ", 作者：" + authorElement.getText());
        }
    }
}
```



## 第六章 Tomcat和Servlet

### 6.1 JavaWeb的概念

1. 什么是 **JavaWeb** 

   JavaWeb 是指，所有通过 Java 语言编写可以通过浏览器访问的程序的总称，叫 JavaWeb。 

   JavaWeb 是基于请求和响应来开发的。 

2. 什么是请求

   请求是指客户端给服务器发送数据，叫请求 Request。 

3. 什么是响应 

   响应是指服务器给客户端回传数据，叫响应 Response。 

4. 请求和响应的关系

   请求和响应是成对出现的，有请求就有响应。

   ![image-20210905171031451](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210905171031451.png)

### 6.2 Web资源的分类

web 资源按实现的技术和呈现的效果的不同，又分为静态资源和动态资源两种。 

- 静态资源： html、css、js、txt、mp4 视频 , jpg 图片 

- 动态资源： jsp 页面、Servlet 程序

### 6.3 Servlet技术

#### 6.3.1 什么是 Servlet ？ 

1. Servlet 是 JavaEE 规范之一。规范就是接口 
2. Servlet 就 JavaWeb 三大组件之一。三大组件分别是：Servlet 程序、Filter 过滤器、Listener 监听器。 
3. Servlet 是运行在服务器上的一个 java 小程序，它可以接收客户端发送过来的请求，并响应数据给客户端。 

#### 6.3.2 手动实现 Servlet程序 

1. 编写一个类去实现 Servlet 接口 
2. 实现 service 方法，处理请求，并响应数据 
3. 到 web.xml 中去配置 servlet 程序的访问地址

```java
package ch06_servlet;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-03-9:46
 */
public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("构造器");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("HelloServlet程序的别名："+servletConfig.getServletName());
        //获取初始化参数
        System.out.println("初始化参数user的值是："+servletConfig.getInitParameter("username"));
        //获取servletContext对象
        System.out.println(servletConfig.getServletContext());

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 专门处理请求和响应
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet 访问了");
        HttpServletRequest httpServletRequest= (HttpServletRequest) servletRequest;
        //获取请求的方式
        String method = httpServletRequest.getMethod();
        if("GET".equals(method)){
            System.out.println("get请求");
        }else if("POST".equals(method)){
            System.out.println("post请求");
        }

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
```

#### 6.3.3 Servlet 的生命周期 

1. 执行 Servlet 构造器方法 

2. 执行 init 初始化方法

**第一、二步，是在第一次访问，的时候创建 Servlet 程序会调用。** 

3. 执行 service 方法 

**第三步，每次访问都会调用。** 

4. 执行 destroy 销毁方法 

**第四步，在 web 工程停止的时候调用。**

#### 6.3.4 GET和POST请求的分发处理

```java
@Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet 访问了");
        HttpServletRequest httpServletRequest= (HttpServletRequest) servletRequest;
        //获取请求的方式
        String method = httpServletRequest.getMethod();
        if("GET".equals(method)){
            System.out.println("get请求");
        }else if("POST".equals(method)){
            System.out.println("post请求");
        }

    }
```

#### 6.3.5 通过继承HttpServlet实现Servlet程序

一般在实际项目开发中，都是使用继承 HttpServlet 类的方式去实现 Servlet 程序。 

1. 编写一个类去继承 HttpServlet 类 
2. 根据业务需要重写 doGet 或 doPost 方法 
3. 到 web.xml 中的配置 Servlet 程序的访问地址

```java
package ch06_servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-03-15:34
 */
public class HelloServlet2 extends HttpServlet {
    /**
     * 在get请求时调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet方法");
    }

    /**
     * 在post请求时调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost方法");
    }
}
```

#### 6.4.6 Servlet类的继承体系

![image-20210905172048370](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210905172048370.png)

#### 6.4.7 ServletConfig类 

- ServletConfig 类从类名上来看，就知道是 Servlet 程序的配置信息类。 

- Servlet 程序和 ServletConfig 对象都是由 Tomcat 负责创建，我们负责使用。 

- Servlet 程序默认是第一次访问的时候创建，ServletConfig 是每个 Servlet 程序创建时，就创建一个对应的 ServletConfig 对象。

**ServletConfig** **类的三大作用** 

1. 可以获取 Servlet 程序的别名 servlet-name 的值 

2. 获取初始化参数 init-param 

3. 获取 ServletContext 对象

```java
@Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("HelloServlet程序的别名："+servletConfig.getServletName());
        //获取初始化参数
        System.out.println("初始化参数user的值是："+servletConfig.getInitParameter("username"));
        //获取servletContext对象
        System.out.println(servletConfig.getServletContext());

    }
```

#### 6.4.8 ServletContext类 

**什么是ServletContext?**

1. ServletContext 是一个接口，它表示 Servlet 上下文对象 
2. 一个 web 工程，只有一个 ServletContext 对象实例。 
3. ServletContext 对象是一个域对象。 
4. ServletContext 是在 web 工程部署启动的时候创建。在 web 工程停止的时候销毁。 

**什么是域对象?** 

域对象，是可以像 Map 一样存取数据的对象，叫域对象。 这里的域指的是存取数据的操作范围，整个 web 工程。 

|        | 存数据         | 取数据         | 删除数据           |
| ------ | -------------- | -------------- | ------------------ |
| Map    | put()          | get()          | remove()           |
| 域对象 | setAttribute() | getAttribute() | removeAttribute(); |

**ServletContext** **类的四个作用** 

1. 获取 web.xml 中配置的上下文参数 context-param 
2. 获取当前的工程路径，格式: /工程路径 
3. 获取工程部署后在服务器硬盘上的绝对路径 
4. 像 Map 一样存取数据

```java
package ch06_servlet; /**
 * @author ZhengXinchang
 * @create 2021-09-03-17:09
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取web.xml中配置的上下文参数context-param
        ServletContext servletContext = getServletConfig().getServletContext();
        String username = servletContext.getInitParameter("username");
        String password = servletContext.getInitParameter("password");
        System.out.println("username的值是："+username);
        System.out.println("password的值是："+password);
        // 2.获取当前的工程路径,格式:/工程路径
        System.out.println("当前工作路径："+servletContext.getContextPath());
        // 3.获取工程部署后在服务器硬盘上的绝对路径
        System.out.println("当前绝对路径："+servletContext.getRealPath("/"));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}

```

```java
package ch06_servlet; /**
 * @author ZhengXinchang
 * @create 2021-09-03-18:50
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ContextServlet1", value = "/ContextServlet1")
public class ContextServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("key1", "value1");
        System.out.println("value1:"+servletContext.getAttribute("key1"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
```

### 6.4 HTTP协议

#### 6.4.1 什么是HTTP协议 

什么是协议? 协议是指双方，或多方，相互约定好，大家都需要遵守的规则，叫协议。 

所谓 HTTP 协议，就是指客户端和服务器之间通信时，发送的数据，需要遵守的规则，叫 HTTP 协议。 HTTP 协议中的数据又叫报文。 

#### 6.4.2 请求的HTTP协议格式 

客户端给服务器发送数据叫**请求**。 

服务器给客户端回传数据叫**响应**。 

请求又分为 GET 请求，和 POST 请求两种 

**i. GET** **请求** 

1、请求行 

(1)  请求的方式  GET 

(2) 请求的资源路径[+?+请求参数] 

(3) 请求的协议的版本号 HTTP/1.1 

2、请求头 

key : value  组成   不同的键值对，表示不同的含义。

![image-20210905172909502](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210905172909502.png)

**ii. POST** **请求** 

1、请求行

(1) 请求的方式  POST 

(2) 请求的资源路径[+?+请求参数] 

(3) 请求的协议的版本号 HTTP/1.1 

2、请求头

(1)key : value 不同的请求头，有不同的含义 

**空行** 

3、请求体 ===>>> 就是发送给服务器的数据

![image-20210905173014076](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210905173014076.png)

**iii.** **常用请求头的说明** 

Accept: 表示客户端可以接收的数据类型 

Accpet-Languege: 表示客户端可以接收的语言类型 

User-Agent: 表示客户端浏览器的信息 

Host： 表示请求时的服务器 ip 和端口号 

**iv.** **哪些是** **GET** **请求，哪些是** **POST** **请求** 

GET 请求有哪些： 

1、form 标签 method=get 

2、a 标签 

3、link 标签引入 css 

4、Script 标签引入 js 文件 

5、img 标签引入图片 

6、iframe 引入 html 页面 

7、在浏览器地址栏中输入地址后敲回车 

POST 请求有哪些： 

8、form 标签 method=post 

#### 6.4.3 相应的HTTP协议格式 

1、响应行 

(1) 响应的协议和版本号 

(2) 响应状态码 

(3) 响应状态描述符 

2、响应头 

(1) key : value 不同的响应头，有其不同含义 

**空行** 

3、响应体 ---->>> 就是回传给客户端的数据

![image-20210905173602954](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210905173602954.png)

**常用的响应码说明**

200  表示请求成功 

302  表示请求重定向 

404 表示请求服务器已经收到了，但是你要的数据不存在（请求地址错误） 

500 表示服务器已经收到请求，但是服务器内部错误（代码错误）

**MIME** **类型说明** 

MIME 是 HTTP 协议中数据类型。 

MIME 的英文全称是"Multipurpose Internet Mail Extensions" 多功能 Internet 邮件扩充服务。MIME 类型的格式是“大类型/小类型”，并与某一种文件的扩展名相对应。

|文件| MIME 类型 |
|--|--|
|超文本标记语言文本| .html , .htm      text/html |
|普通文本| .txt       text/plain |
|RTF 文本| .rtf      application/rtf |
|GIF 图形| .gif          image/gif |
|JPEG 图形| .jpeg,.jpg        image/jpeg |
|au 声音文件| .au         audio/basic |
|MIDI 音乐文件| mid,.midi  audio/midi,audio/x-midi |
|RealAudio| 音乐文件 .ra, .ram        audio/x-pn-realaudio |
|MPEG 文件| .mpg,.mpeg        video/mpeg |
|AVI 文件| .avi          video/x-msvideo |
|GZIP 文件| .gz          application/x-gzip |
|TAR 文件| .tar        application/x-tar |

## 第七章 servlet2

### 7.1 HttpServletRequest 类 

#### 7.1.1 HttpServletRequest类有什么作用。 

每次只要有请求进入 Tomcat 服务器，Tomcat 服务器就会把请求过来的 HTTP 协议信息解析好封装到 Request 对象中。然后传递到 service 方法（doGet 和 doPost）中给我们使用。我们可以通过 HttpServletRequest 对象，获取到所有请求的信息。 

#### 7.1.2 HttpServletRequest类的常用方法 

i. getRequestURI()   获取请求的资源路径 

ii. getRequestURL()   获取请求的统一资源定位符（绝对路径） 

iii. 
getRemoteHost()   获取客户端的 ip 地址 

iv. getHeader()  获取请求头 

v. getParameter()   获取请求的参数 

vi. getParameterValues()   获取请求的参数（多个值的时候使用） 

vii. getMethod()   获取请求的方式 GET 或 POST 

viii.  setAttribute(key, value);   设置域数据 

ix. getAttribute(key);  获取域数据 

x. getRequestDispatcher()  获取请求转发对象

```JAVA
public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //i. getRequestURI() 获取请求的资源路径
        System.out.println("URI=>"+req.getRequestURI());
        // ii. getRequestURL() 获取请求的统一资源定位符（绝对路径）
        System.out.println("URL=>"+req.getRequestURL());
        // iii. getRemoteHost() 获取客户端的 ip 地址
        System.out.println("客户端ip地址=>"+req.getRemoteHost());
        // iv. getHeader() 获取请求头
        System.out.println("请求头User-Agent=>"+req.getHeader("User-Agent"));
        // v. getParameter() 获取请求的参数

        // vi. getParameterValues() 获取请求的参数（多个值的时候使用）
        // vii. getMethod() 获取请求的方式 GET 或 POST
        System.out.println("请求的方式=>"+req.getMethod());
        // viii. setAttribute(key, value); 设置域数据
        // ix. getAttribute(key); 获取域数据
        // x. getRequestDispatcher() 获取请求转发对象
    }
}
```

#### 7.1.3 如何获取请求参数

```java
package ch07_servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author ZhengXinchang
 * @create 2021-09-04-10:38
 */
public class ParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数
        System.out.println("=============doGet================");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
        System.out.println("爱好：" + Arrays.asList(hobbies));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        System.out.println("=============doPost================");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
        System.out.println("爱好：" + Arrays.asList(hobbies));
    }
}

```

#### 7.1.4 请求的转发

什么是请求的转发? 

请求转发是指，服务器收到请求后，从一次资源跳转到另一个资源的操作叫请求转发。

![image-20210905182405134](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210905182405134.png)

servlet1代码

```java
package ch07_servlet2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-04-15:19
 */
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("在servlet1中的username：" + username);

        req.setAttribute("key", "servlet1 的章");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");

        requestDispatcher.forward(req, resp);

    }
}

```

servlet2代码

```java
package ch07_servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-04-15:19
 */
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("在servlet2中的username：" + username);

        Object key = req.getAttribute("key");
        System.out.println("柜台1是否有章："+key);

        System.out.println("处理自己的业务");
    }
}
```

#### 7.1.5 base标签的作用

![image-20210905182525944](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210905182525944.png)

```html
<!DOCTYPE html> 
<html lang="zh_CN"> 
    <head> 
        <meta charset="UTF-8"> 
        <title>Title</title> 
        <!--base 标签设置页面相对路径工作时参照的地址 href 属性就是参数的地址值 --> 
        <base href="http://localhost:8080/07_servlet/a/b/">
    </head> 
<body> 
    这是 a 下的 b 下的 c.html 页面<br/>
    <a href="../../index.html">跳回首页</a><br/> 
    </body>
</html>
```

#### 7.1.6 Web中的相对路径和绝对路径 

在 javaWeb 中，路径分为相对路径和绝对路径两种： 

相对路径是： 

.    表示当前目录 

..   表示上一级目录 

资源名   表示当前目录/资源名 

绝对路径： http://ip:port/工程路径/资源路径 

在实际开发中，路径都使用绝对路径，而不简单的使用相对路径。 

1、绝对路径 

2、base+相对 

#### 7.1.7 web中/斜杠的不同意义 

在 web 中 / 斜杠 是一种绝对路径。 

/  斜杠 如果被浏览器解析，得到的地址是：http://ip:port/ 

/ 斜杠  如果被服务器解析，得到的地址是：http://ip:port/工程路径 

1、<**url-pattern**>/servlet1</**url-pattern**> 

2、servletContext.getRealPath(“/”); 

3、request.getRequestDispatcher(“/”); 

特殊情况： response.sendRediect(“/”);  把斜杠发送给浏览器解析。得到 http://ip:port/

### 7.2 HttpServletResponse类 

#### 7.2.1 HttpServletResponse类的作用 

HttpServletResponse 类和 HttpServletRequest 类一样。每次请求进来，Tomcat 服务器都会创建一个 Response 对象传 递给 Servlet 程序去使用。HttpServletRequest 表示请求过来的信息，HttpServletResponse 表示所有响应的信息， 我们如果需要设置返回给客户端的信息，都可以通过 HttpServletResponse 对象来进行设置

#### 7.2.2 两个输出流的说明。

字节流   getOutputStream();   常用于下载（传递二进制数据） 

字符流   getWriter();   常用于回传字符串（常用） 

两个流同时只能使用一个。 使用了字节流，就不能再使用字符流，反之亦然，否则就会报错。

#### 7.2.3 请求重定向

请求重定向，是指客户端给服务器发请求，然后服务器告诉客户端说。我给你一些地址。你去新地址访问。叫请求重定向（因为之前的地址可能已经被废弃）。

![image-20210905183345531](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210905183345531.png)

请求重定向的第一种方案： 

```java
//设置响应状态码* *302* *，表示重定向，（已搬迁）
resp.setStatus(302); 
//设置响应头，说明 新的地址在哪里
resp.setHeader(**"Location"**, **"http://localhost:8080"**); 
```

请求重定向的第二种方案（推荐使用）： 

```java
resp.sendRedirect(**"http://localhost:8080"**);
```

## 第八章 jsp

### 8.1 什么是jsp

jsp 的全换是 java server pages。Java 的服务器页面。 jsp 的主要作用是代替 Servlet 程序回传 html 页面的数据。

### 8.2 jsp的本质是什么

jsp 页面本质上是一个 Servlet 程序。 当我们第一次访问 jsp 页面的时候。Tomcat 服务器会帮我们把 jsp 页面翻译成为一个 java 源文件。并且对它进行编译成为.class 字节码程序。

### 8.3 jsp的三种语法

#### 8.3.1 jsp头部的page 指令

jsp 的 page 指令可以修改 jsp 页面中一些重要的属性，或者行为。

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="j
```

i. language 属性    表示 jsp 翻译后是什么语言文件。暂时只支持 java。 

ii. contentType 属性    表示 jsp 返回的数据类型是什么。也是源码中 response.setContentType()参数值 

iii. pageEncoding 属性    表示当前 jsp 页面文件本身的字符集。 

iv. import 属性    跟 java 源代码中一样。用于导包，导类。 

========================两个属性是给 out 输出流使用============================= 

v. autoFlush 属性    设置当 out 输出流缓冲区满了之后，是否自动刷新冲级区。默认值是 true。 

vi. buffer 属性   设置 out 缓冲区的大小。默认是 8kb 

========================两个属性是给 out 输出流使用============================= 

vii.  errorPage 属性   设置当 jsp 页面运行时出错，自动跳转去的错误页面路径。

#### 8.3.2 jsp中常用脚本

（1）表达式脚本

表达式脚本的格式是：**<%=**表达式**%>** 

表达式脚本的作用是：的 jsp 页面上输出数据。

```jsp
<%=12 %> <br> 
<%=12.12 %> <br> 
<%="我是字符串" %> <br> 
<%=map%> <br> 
<%=request.getParameter("username")%>
```

(2)代码脚本

代码脚本的格式是： 

```jsp
<% 
	java 语句 
%> 
```

代码脚本的作用是：可以在 jsp 页面中，编写我们自己需要的功能（写的是 java 语句）。

```jsp
<%--练习：--%> <%--1.代码脚本----if 语句--%>
<%
    int i = 13;
    if (i == 12) {
%>
<h1>国哥好帅</h1>
<%
} else {
%>
<h1>国哥又骗人了！</h1>
<%
    }
%> <br>
<%--2.代码脚本----for 循环语句--%>
<table border="1" cellspacing="0">
    <% for (int j = 0; j < 10; j++) {
    %>
    <tr>
        <td>第 <%=j + 1%>行</td>
    </tr>
    <% } %></table>
<%--3.翻译后 java 文件中_jspService 方法内的代码都可以写--%>
<%
    String username = request.getParameter("username");
    System.out.println("用户名的请求参数值是：" + username);
%>
```

### 8.4 jsp的九大内置对象

jsp 中的内置对象，是指 Tomcat 在翻译 jsp 页面成为 Servlet 源代码后，内部提供的九大对象，叫内置对象。

![image-20210912163854482](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210912163854482.png)

### 8.5 jsp四大域对象

|域对象|类	| 有效范围     |
| ---- | ---- | ---- |
|pageContext| (PageContextImpl 类)| 当前 jsp 页面范围内有效 |
|request| (HttpServletRequest 类)| 一次请求内有效 |
|session| (HttpSession 类)| 一个会话范围内有效（打开浏览器访问服务器，直到关闭浏览器） |
|application| (ServletContext 类) |整个 web 工程范围内都有效（只要 web 工程不停止，数据都在）|

域对象是可以像 Map 一样存取数据的对象。四个域对象功能一样。不同的是它们对数据的存取范围。 

虽然四个域对象都可以存取数据。在使用上它们是有优先顺序的。 

四个域在使用的时候，优先顺序分别是，他们从小到大的范围的顺序。 

pageContext ====>>> request ====>>> session ====>>> application

### 8.6 jsp常用标签

（1）静态包含

```jsp
<%--
<%@ include file=""%> 就是静态包含 
    file 属性指定你要包含的 jsp 页面的路径 
    地址中第一个斜杠 / 表示为 http://ip:port/工程路径/ 映射到代码的 web 目录 

静态包含的特点： 
    1、静态包含不会翻译被包含的 jsp 页面。 
    2、静态包含其实是把被包含的 jsp 页面的代码拷贝到包含的位置执行输出。
--%>
<%@ include file="/include/footer.jsp" %>
```

(2)jsp标签+转发

```jsp
<%--
    <jsp:forward page=""></jsp:forward> 是请求转发标签，它的功能就是请求转发 
    page 属性设置请求转发的路径 --%> 
<jsp:forward page="/scope2.jsp"></jsp:forward>
```



## 第九章 EL表达式和JSTL标签库

### 9.1 EL表达式

#### 9.1.1 什么是EL表达式和EL表达式的作用

EL 表达式的全称是：Expression Language。是表达式语言。 

EL 表达式的什么作用：EL 表达式主要是代替 jsp 页面中的表达式脚本在 jsp 页面中进行数据的输出。 因为 EL 表达式在输出数据的时候，要比 jsp 的表达式脚本要简洁很多。

```jsp
<body>
<%
    request.setAttribute("key", "值");
%>
表达式脚本输出 key 的值是：
<%=request.getAttribute("key1") == null ? "" : request.getAttribute("key1")%><br/>
EL 表达式输出 key 的值是：${key1}
</body>
```

EL 表达式的格式是：${表达式} 

EL 表达式在输出 null 值的时候，输出的是空串。jsp 表达式脚本输出 null 值的时候，输出的是 null 字符串。

#### 9.1.2 EL表达式搜索域数据的顺序

EL 表达式主要是在 jsp 页面中输出数据。 

主要是输出域对象中的数据。 

当四个域中都有相同的 key 的数据的时候，EL 表达式会按照四个域的从小到大的顺序去进行搜索，找到就输出。

（1）EL表达式的11个隐含对象

| 变量|   类型   |  作用    |
| ---- | ---- | ---- |
|pageContext |PageContextImpl |它可以获取 jsp 中的九大内置对象 |
|pageScope |Map<String,Object>| 它可以获取 pageContext 域中的数据 |
|requestScope| Map<String,Object>| 它可以获取 Request 域中的数据 |
|sessionScope |Map<String,Object> |它可以获取 Session 域中的数据|
|applicationScope| Map<String,Object> |它可以获取 ServletContext 域中的数据 |
|param |Map<String,String>| 它可以获取请求参数的值 |
|paramValues |Map<String,String[]> |它也可以获取请求参数的值，获取多个值的时候使用。|
|header| Map<String,String> |它可以获取请求头的信息 |
|headerValues| Map<String,String[]> |它可以获取请求头的信息，它可以获取多个值的情况|
|cookie |Map<String,Cookie> |它可以获取当前请求的 Cookie 信息|
|initParam| Map<String,String> |它可以获取在 web.xml 中配置的<context-param>上下文参数|

**EL** **获取四个特定域中的属性** 

pageScope ====== pageContext 域 

requestScope ====== Request 域 

sessionScope ====== Session 域 

applicationScope ====== ServletContext 域

### 9.2 JSTL标签库

**core核心库的使用**

```jsp
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/4
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
    i.<c:set />
        作用：set标签可以往域中保存数据

        域对象.setAttribute(key,value);
        scope 属性设置保存到哪个域
            page表示PageContext域（默认值）
            request表示Request域
            session表示Session域
            application表示ServletContext域
        var属性设置key是多少
        value属性设置值
    --%>
    保存之前：${ sessionScope.abc } <br>
    <c:set scope="session" var="abc" value="abcValue"/>
    保存之后：${ sessionScope.abc } <br>
    <hr>

    <%--
       ii.<c:if />
         if标签用来做if判断。
         test属性表示判断的条件（使用EL表达式输出）
    --%>
    <c:if test="${ 12 == 12 }">
        <h1>12等于12</h1>
    </c:if>
    <c:if test="${ 12 != 12 }">
        <h1>12不等于12</h1>
    </c:if>
    <hr>

    <%--
    iii.<c:choose> <c:when> <c:otherwise>标签
    作用：多路判断。跟switch ... case .... default非常接近

    choose标签开始选择判断
    when标签表示每一种判断情况
        test属性表示当前这种判断情况的值
    otherwise标签表示剩下的情况

    <c:choose> <c:when> <c:otherwise>标签使用时需要注意的点：
        1、标签里不能使用html注释，要使用jsp注释
        2、when标签的父标签一定要是choose标签
    --%>
    <%
        request.setAttribute("height", 180);
    %>
    <c:choose>
        <%-- 这是html注释 --%>
        <c:when test="${ requestScope.height > 190 }">
            <h2>小巨人</h2>
        </c:when>
         <c:when test="${ requestScope.height > 180 }">
            <h2>很高</h2>
        </c:when>
        <c:when test="${ requestScope.height > 170 }">
            <h2>还可以</h2>
        </c:when>
        <c:otherwise>
            <c:choose>
                <c:when test="${requestScope.height > 160}">
                    <h3>大于160</h3>
                </c:when>
                <c:when test="${requestScope.height > 150}">
                    <h3>大于150</h3>
                </c:when>
                <c:when test="${requestScope.height > 140}">
                    <h3>大于140</h3>
                </c:when>
                <c:otherwise>
                    其他小于140
                </c:otherwise>
            </c:choose>
        </c:otherwise>
    </c:choose>


</body>
</html>

```

**foreach的使用**

```jsp
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="com.atguigu.pojo.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/4
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table{
            width: 500px;
            border: 1px solid red;
            border-collapse: collapse;
        }
        th , td{
            border: 1px solid red;
        }
    </style>
</head>
<body>
    <%--1.遍历1到10，输出
        begin属性设置开始的索引
        end 属性设置结束的索引
        var 属性表示循环的变量(也是当前正在遍历到的数据)
        for (int i = 1; i < 10; i++)

    <table border="1">
        <c:forEach begin="1" end="10" var="i">
            <tr>
                <td>第${i}行</td>
            </tr>
        </c:forEach>
    </table>--%>
    <hr>
   <%-- 2.遍历Object数组
        for (Object item: arr)
        items 表示遍历的数据源（遍历的集合）
        var 表示当前遍历到的数据

    <%
        request.setAttribute("arr", new String[]{"18610541354","18688886666","18699998888"});
    %>
    <c:forEach items="${ requestScope.arr }" var="item">
        ${ item } <br>
    </c:forEach> --%>
    <hr>
    <%
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
//        for ( Map.Entry<String,Object> entry : map.entrySet()) {
//        }
        request.setAttribute("map", map);
    %>
    <c:forEach items="${ requestScope.map }" var="entry">
        <h1>${entry.key} = ${entry.value}</h1>
    </c:forEach>
    <hr>
    <%--4.遍历List集合---list中存放 Student类，有属性：编号，用户名，密码，年龄，电话信息--%>
    <%
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 1; i <= 10; i++) {
            studentList.add(new Student(i,"username"+i ,"pass"+i,18+i,"phone"+i));
        }
        request.setAttribute("stus", studentList);
    %>
    <form action="" enctype=""></form>
    <table>
        <tr>
            <th>编号</th>
            <th>用户名</th>
            <th>密码</th>
            <th>年龄</th>
            <th>电话</th>
            <th>操作</th>
        </tr>
        <%--
            items 表示遍历的集合
            var 表示遍历到的数据
            begin表示遍历的开始索引值
            end 表示结束的索引值
            step 属性表示遍历的步长值
            varStatus 属性表示当前遍历到的数据的状态
            for（int i = 1; i < 10; i+=2）
        --%>
    <c:forEach begin="2" end="7" step="2" varStatus="status" items="${requestScope.stus}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.username}</td>
            <td>${stu.password}</td>
            <td>${stu.age}</td>
            <td>${stu.phone}</td>
            <td>${status.step}</td>
        </tr>
    </c:forEach>
    </table>

</body>
</html>

```









## 书城项目

### 第一阶段 表单的验证

**要求**

1. 验证用户名：必须由字母，数字下划线组成，并且长度为 5 到 12 位 
2. 验证密码：必须由字母，数字下划线组成，并且长度为 5 到 12 位 
3. 验证确认密码：和密码相同 
4. 邮箱验证：xxxxx@xxx.com 
5. 验证码：现在只需要验证用户已输入。因为还没讲到服务器。验证码生成。

**验证实现如下**

```html
<script type="text/javascript" src="static/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#sub_btn").click(function () {
                // 验证用户名：必须由字母，数字下划线组成，并且长度为 5 到 12 位
                //1.获取用户名输入框内容
                var userName = $("#username").val();
                //2.创建正则式
                var userNamePat = /^\w{5,12}$/;
                //3.使用test方法验证
                if (!userNamePat.test(userName)) {
                    //4.提示用户结果
                    $("span.errorMsg").text("用户名不合法！");
                    return false;
                }
                //4.提示用户结果
                // 验证密码：必须由字母，数字下划线组成，并且长度为 5 到 12 位
                //1.获取密码输入框内容
                var password = $("#password").val();
                //2.创建正则式
                var passwordPat = /^\w{5,12}$/;
                //3.使用test方法验证
                if (!passwordPat.test(password)) {
                    //4.提示用户结果
                    $("span.errorMsg").text("密码不合法！");
                    return false;
                }
                //4.提示用户结果
                // 验证确认密码：和密码相同
                var repwdText = $("#repwd").val();
                if (repwdText != password) {
                    $("span.errorMsg").text("确认密码和密码不一致！");
                    return false;
                }
                // 邮箱验证：xxxxx@xxx.com
                var emailText = $("#email").val();
                var emailPat = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
                if (!emailPat.test(emailText)) {
                    $("span.errorMsg").text("邮箱格式不正确");
                    return false;
                }
                // 验证码：现在只需要验证用户已输入。因为还没讲到服务器。验证码生成。
                var codeText = $("#code").val();
                codeText = $.trim(codeText);
                if (codeText == null || codeText == "") {
                    $("span.errorMsg").text("验证码不能为空");
                    return false;
                }
                $("span.errorMsg").text("");
            });
        });
    </script>
```

### 第二阶段 用户注册和登陆

#### JavaEE项目的三层架构

![image-20210905183656361](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210905183656361.png)

web 层     com.atguigu.web/servlet/controller 

service 层   com.atguigu.service    Service 接口包 

​					com.atguigu.service.impl      Service 接口实现类 

dao 持久层      com.atguigu.dao     Dao 接口包 

​							com.atguigu.dao.impl     Dao 接口实现类 

实体 bean 对象     com.atguigu.pojo/entity/domain/bean    JavaBean 类 

测试包     com.atguigu.test/junit 

工具类    com.atguigu.utils

#### 1 创建书城所需要的数据库

```sql
drop database if exists books;

create database book;

use book;
create table user_table
(
    id       int primary key auto_increment,
    username varchar(100) not null unique,
    password varchar(32)  not null,
    email    varchar(200)
);
insert into  user_table (username, password, email) values('郑鑫昌','123','1595761455@qq.com');
select * from user_table
```

#### 2 创建对象User类

```java
package pojo;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-10:14
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;

    public User() {
    }


    public User(Integer id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

```

#### 3 编写工具类JdbcUtils

##### 创建连接

```java
private static DruidDataSource dataSource;

    static {
        try {
            Properties properties = new Properties();
            //读取配置文件
            InputStream inputStream = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(inputStream);
            //创建数据库连接池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接池中的连接
     *
     * @return
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
```

##### 关闭连接

```java
/**
     * 关闭连接
     */
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
```

#### 4 编写DAO

##### 编写BaseDao

```java
package dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-10:39
 */
public abstract class BaseDao {
    private QueryRunner queryRunner = new QueryRunner();


    /**
     * 用来执行insert/update/delete 语句
     *
     * @param sql
     * @param args
     * @return 如果返回-1，则执行失败
     */
    public int update(String sql, Object... args) {
        Connection connection = JDBCUtils.getConnection();
        try {
            return queryRunner.update(connection, sql, args);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection);
        }
        return -1;
    }

    /**
     * 查询返回一个Javabean的sql语句
     *
     * @param type 返回的对象类型
     * @param sql  执行的sql语句
     * @param args 参数值
     * @param <T>  返回类型的泛型
     * @return
     */
    public <T> T queryForOne(Class<T> type, String sql, Object... args) {
        Connection connection = JDBCUtils.getConnection();
        try {
            return queryRunner.query(connection, sql, new BeanHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection);
        }
        return null;
    }

    /**
     * 查询返回多个Javabean的sql语句
     *
     * @param type 返回的对象类型
     * @param sql  执行的sql语句
     * @param args 参数值
     * @param <T>  返回类型的泛型
     * @return
     */
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        Connection connection = JDBCUtils.getConnection();
        try {
            return queryRunner.query(connection, sql, new BeanListHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection);
        }
        return null;
    }

    /**
     * 返回一行一列的sql语句
     *
     * @param sql
     * @param args
     * @return
     */

    public Object queryForSingleValue(String sql, Object... args) {
        Connection connection = JDBCUtils.getConnection();
        try {
            return queryRunner.query(connection, sql, new ScalarHandler(), args);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection);
        }
        return null;
    }
}

```

##### 编写userDao的接口

```java
package dao;


import pojo.User;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-11:17
 */

public interface UserDao {

    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    public User queryUserByUserName(String username);

    /**
     * 保存用户信息
     *
     * @param user
     * @return
     */
    public int savaUser(User user);

    /**
     * 根据用户名和密码登录
     *
     * @param username
     * @param password
     * @return
     */
    public User queryUserByUserNameAndPassword(String username, String password);

}

```

##### 编写userDao的实现类

```java
package dao.impl;

import dao.UserDao;
import pojo.User;


/**
 * @author ZhengXinchang
 * @create 2021-09-05-11:22
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUserName(String username) {
        String sql = "select id,username,password,email from user_table where username=?";
        return queryForOne(User.class, sql, username);
    }

    @Override
    public int savaUser(User user) {
        String sql = "insert into  user_table (username, password, email) values(?,?,?)";
        return update(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }

    @Override
    public User queryUserByUserNameAndPassword(String username, String password) {
        String sql = "select id,username,password,email from user_table where username=? and password=?";
        return queryForOne(User.class, sql, username, password);
    }
}
```

#### 5 编写service层

##### userService接口

```java
package service;

import pojo.User;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-11:43
 */
public interface UserService {
    /**
     * 注册用户
     *
     * @param user
     */
    public void registerUser(User user);

    /**
     * 登录用户
     *
     * @param user
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     *
     * @param username
     * @return 返回true表示用户名已经存在
     */
    public boolean existUserName(String username);
}
```

##### service实现类

```java
package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import pojo.User;
import service.UserService;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-14:31
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registerUser(User user) {
        userDao.savaUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUserNameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existUserName(String username) {
        if (userDao.queryUserByUserName(username) == null) {
            return false;
        }
        return true;
    }
}
```

#### 6 编写web层

![image-20210905184647885](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210905184647885.png)

##### 修改注册界面 html和注册成功html

##### 编写注册servlet程序

```java
package web;

import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-14:51
 */
public class RegisterServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        //验证码
        if ("abcde".equalsIgnoreCase(code)) {
            //检查用户名是否可用
            if (userService.existUserName(username)) {//不可用
                System.out.println("用户名[" + username + "]不可用，已存在");
                req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
            } else {  //可用
                User user = new User(null, username, password, email);
                userService.registerUser(user);
                //跳到注册成功页面
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req, resp);
            }
        } else {
            System.out.println("验证码[" + code + "]错误 ");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
        }
    }
}
```

##### 修改登录界面 html和登录成功html

##### 编写登录servlet程序

```java
package web;

import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-16:19
 */
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (userService.login(new User(null, username, password, null)) == null) {
            System.out.println("登录失败");
            req.getRequestDispatcher("/pages/user/login.html").forward(req, resp);
        } else {
            System.out.println("登录成功");
            req.getRequestDispatcher("/pages/user/login_success.html").forward(req, resp);
        }

    }
}
```

### 第三阶段

#### 1.页面jsp动态化

1. 在 html 页面顶行添加 page 指令。 
2. 修改文件后缀名为：.jsp 
3. 使用 IDEA 搜索替换.html 为.jsp(快捷键：Ctrl+Shift+R)

#### 2.抽取页面中相同的内容

1. head标签
2. 每个页面的页脚
3. 登陆成功后的菜单
4. manager模块中的菜单

#### 3.登录注册错误时的提示，及表单的回显

以登录为例，将回显信息添加到request域中：

```java
if (loginUser == null) {
    System.out.println("登录失败");
    //把错误信息，和回显的表单项信息，保存到request域中
    req.setAttribute("msg", "用户名或密码错误");
    req.setAttribute("username", username);
    req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
}
```

jsp页面也要输出回显信息：

```jsp
<%--登录错误信息--%>
${requestScope.msg==null?"请输入用户名和密码":requestScope.msg}
<%--用户名回显信息--%>
<input class="itxt" type="text" placeholder="请输入用户名"  
       autocomplete="off"tabindex="1" name="username" value="${requestScope.username}"/>
```

#### 4.BaseServlet的抽取

##### 优化一：合并LoginServlet和RgistServlet程序为UserServlet程序

##### 优化二：使用反射优化大量else if代码

```java
@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String action = req.getParameter("action");

        try {
            Method declaredMethod = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
            declaredMethod.invoke(this, req, resp);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
```

##### 优化三：抽取BaseServlet程序

#### 5.数据的封装和抽取BeanUtils的使用

```java
package utils;

import org.apache.commons.beanutils.BeanUtils;
import pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author ZhengXinchang
 * @create 2021-09-09-15:43
 */
public class WebUtils {
    //把 Map 中的值注入到对应的 JavaBean 属性中。
    public static <T> T copyParamToBean(Map value, T bean) {
        try {
            BeanUtils.populate(bean, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return bean;
    }
}
```

### 第四阶段 使用EL表达式修改表单回显

### 第五阶段 

#### MVC 概念

MVC 

全称：Model 模型、 View 视图、 Controller 控制器。 

MVC 

最早出现在 JavaEE 三层中的 Web 层，它可以有效的指导 Web 层的代码如何有效分离，单独工作。 

View 视图：只负责数据和界面的显示，不接受任何与显示数据无关的代码，便于程序员和美工的分工合作—— JSP/HTML。

Controller 控制器：只负责接收请求，调用业务层的代码处理请求，然后派发页面，是一个“调度者”的角色——Servlet。 转到某个页面。或者是重定向到某个页面。 

Model 模型：将与业务逻辑相关的数据封装为具体的 JavaBean 类，其中不掺杂任何与数据处理相关的代码——JavaBean/domain/entity/pojo。 

**MVC** **是一种思想** 

MVC 的理念是将软件代码拆分成为组件，单独开发，组合使用（**目的还是为了降低耦合度**）。

![image-20210912171737807](C:\Users\ZhengXinchang\AppData\Roaming\Typora\typora-user-images\image-20210912171737807.png)

**MVC** **的作用还是为了降低耦合。让代码合理分层。方便后期升级和维护。**

#### 1.图书模块

##### 1.1编写图书的数据库表

```sql
create table book_table(
    id int primary key auto_increment,
    name varchar(100),
    price decimal(11,2),
    author varchar(100),
    sales int,
    stock int,
    img_path varchar(200)
);
```

##### 1.2 编写图书的javaBean

Book类

```java
package pojo;

/**
 * @author ZhengXinchang
 * @create 2021-09-09-17:13
 */
public class Book {
    private Integer id;
    private String name;
    private double price;
    private String author;
    private int sales;
    private int stock;
    private String imgPath = "static/img/default.jpg";

    public Book() {
    }

    public Book(Integer id, String name, double price, String author, int sales, int stock, String imgPath) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.sales = sales;
        this.stock = stock;
        //要求给定的图书封面路径不能为空
        if (imgPath != null && !"".equals(imgPath)) {
            this.imgPath = imgPath;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        if (imgPath != null && !"".equals(imgPath)) {
            this.imgPath = imgPath;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", sales=" + sales +
                ", stock=" + stock +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }
}

```

##### 1.3编写图书模块的Dao

Dao接口

```java
public interface BookDao {

    public int addBook(Book book);

    public int deleteBookById(Integer id);

    public int updateBook(Book book);

    public Book queryBookById(Integer id);

    public Book queryBookByName(String name);

    public List<Book> queryBooks();

    public Integer queryForPageTotalCount();

    public List<Book> queryForPageItems(int begin,int pageSize);
}
```

BookDaoImpl实现类

```java
public class BookDaoImpl extends BaseDao implements BookDao {

    @Override
    public int addBook(Book book) {
        String sql = "insert into book_table(`name`,`author`,`price`,`sales`,`stock`,`img_path`) " +
                "values(?,?,?,?,?,?)";
        return update(sql, book.getName(), book.getAuthor(), book.getPrice(), book.getSales(), book.getStock(), book.getImgPath());
    }

    @Override
    public int deleteBookById(Integer id) {
        String sql = "delete from book_table where id=?";
        return update(sql, id);
    }

    @Override
    public int updateBook(Book book) {
        String sql = "update book_table set `name`=?,`author`=?,`price`=?,`sales`=?,`stock`=?,`img_path`=? where id=?";
        return update(sql, book.getName(), book.getAuthor(), book.getPrice(), book.getSales(),
                book.getStock(), book.getImgPath(), book.getId());
    }

    @Override
    public Book queryBookById(Integer id) {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` imgPath " +
                "from book_table where id=?";
        return queryForOne(Book.class, sql, id);
    }

    @Override
    public Book queryBookByName(String name) {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` imgPath from book_table where name=?";
        return queryForOne(Book.class, sql, name);
    }

    @Override
    public List<Book> queryBooks() {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` imgPath from book_table";
        return queryForList(Book.class, sql);
    }

    @Override
    public Integer queryForPageTotalCount() {
        String sql = "select count(*) from `book_table`";
        Number value = (Number) queryForSingleValue(sql);
        return value.intValue();
    }

    @Override
    public List<Book> queryForPageItems(int begin, int pageSize) {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` imgPath from book_table limit ?,?";
        return queryForList(Book.class, sql, begin, pageSize);
    }
}
```

##### 1.4 编写图书模块的service

BookService接口

```java
public interface BookService {

    public void addBook(Book book);

    public void deleteBookById(Integer id);

    public void updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();
}
```

BookService接口实现类

```java
public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();

    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookDao.deleteBookById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public List<Book> queryBooks() {
        return bookDao.queryBooks();
    }
}
```

##### 1.5 编写图书模块的web层，和页面的联调测试

