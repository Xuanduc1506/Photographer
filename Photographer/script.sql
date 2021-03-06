USE [Photographer]
GO
/****** Object:  Table [dbo].[Gallery]    Script Date: 6/24/2021 11:08:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Gallery](
	[id] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[description] [text] NULL,
	[image] [nvarchar](50) NULL,
 CONSTRAINT [PK_Gallery] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ImagesOfGallery]    Script Date: 6/24/2021 11:08:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ImagesOfGallery](
	[id_image] [int] NOT NULL,
	[url] [nvarchar](50) NOT NULL,
	[id_gallery] [int] NOT NULL,
 CONSTRAINT [PK_ImagesOfGallery] PRIMARY KEY CLUSTERED 
(
	[id_image] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Introduction]    Script Date: 6/24/2021 11:08:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Introduction](
	[name] [nvarchar](50) NOT NULL,
	[image] [nvarchar](50) NOT NULL,
	[address] [nvarchar](50) NOT NULL,
	[city] [nvarchar](50) NOT NULL,
	[country] [nvarchar](50) NOT NULL,
	[map] [nvarchar](50) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[tel] [nvarchar](50) NOT NULL,
	[description] [text] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SocialNetwork]    Script Date: 6/24/2021 11:08:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SocialNetwork](
	[name] [nvarchar](50) NOT NULL,
	[url] [nvarchar](50) NOT NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[View]    Script Date: 6/24/2021 11:08:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[View](
	[View] [int] NOT NULL
) ON [PRIMARY]

GO
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (1, N'Gallery1', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh0.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (2, N'Gallery2', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh1.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (3, N'Gallery3', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh2.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (4, N'Gallery4', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh3.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (5, N'Gallery5', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh4.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (6, N'Gallery6', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh5.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (7, N'Gallery7', N'NULLLorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh6.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (8, N'Gallery8', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh7.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (9, N'Gallrey9', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh8.jpg')
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (1, N'anh0.jpg', 1)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (2, N'anh8.jpg', 1)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (3, N'anh2.jpg', 1)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (4, N'anh3.jpg', 1)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (5, N'anh4.jpg', 1)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (6, N'anh5.jpg', 1)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (7, N'anh6.jpg', 1)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (8, N'anh7.jpg', 1)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (9, N'anh8.jpg', 1)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (10, N'anh0.jpg', 1)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (11, N'anh0.jpg', 2)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (12, N'anh8.jpg', 2)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (13, N'anh2.jpg', 2)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (14, N'anh3.jpg', 2)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (15, N'anh3.jpg', 2)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (16, N'anh4.jpg', 2)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (17, N'anh5.jpg', 2)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (18, N'anh6.jpg', 2)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (19, N'anh7.jpg', 2)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (20, N'anh8.jpg', 2)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (21, N'anh2.jpg', 3)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (22, N'anh7.jpg', 3)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (23, N'anh3.jpg', 3)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (24, N'anh4.jpg', 3)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (25, N'anh5.jpg', 3)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (26, N'anh6.jpg', 3)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (27, N'anh7.jpg', 3)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (28, N'anh8.jpg', 3)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (29, N'anh0.jpg', 3)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (30, N'anh2.jpg', 3)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (31, N'anh3.jpg', 4)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (32, N'anh6.jpg', 4)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (33, N'anh2.jpg', 4)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (34, N'anh3.jpg', 4)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (35, N'anh4.jpg', 4)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (36, N'anh5.jpg', 4)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (37, N'anh6.jpg', 4)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (38, N'anh7.jpg', 4)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (39, N'anh8.jpg', 4)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (40, N'anh3.jpg', 4)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (41, N'anh4.jpg', 5)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (42, N'anh0.jpg', 5)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (43, N'anh2.jpg', 5)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (44, N'anh4.jpg', 5)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (45, N'anh3.jpg', 5)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (46, N'anh5.jpg', 5)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (47, N'anh6.jpg', 5)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (48, N'anh7.jpg', 5)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (49, N'anh8.jpg', 5)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (50, N'anh4.jpg', 5)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (51, N'anh5.jpg', 6)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (52, N'anh8.jpg', 6)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (53, N'anh2.jpg', 6)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (54, N'anh3.jpg', 6)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (55, N'anh4.jpg', 6)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (56, N'anh5.jpg', 6)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (57, N'anh6.jpg', 6)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (58, N'anh7.jpg', 6)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (59, N'anh7.jpg', 6)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (60, N'anh8.jpg', 6)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (61, N'anh6.jpg', 7)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (62, N'anh8.jpg', 7)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (63, N'anh2jpg', 7)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (64, N'anh7.jpg', 8)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (65, N'anh5.jpg', 8)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (66, N'anh2.jpg', 8)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (67, N'anh8.jpg', 9)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (68, N'anh6.jpg', 9)
INSERT [dbo].[ImagesOfGallery] ([id_image], [url], [id_gallery]) VALUES (69, N'anh7.jpg', 9)
INSERT [dbo].[Introduction] ([name], [image], [address], [city], [country], [map], [email], [tel], [description]) VALUES (N'Lorem ipsum dolor sit amet', N'anh0.jpg', N'Cua Nam', N'Vinh', N'Viet Nam', N'vt.png', N'ducnxhe141626', N'0904912207', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim')
INSERT [dbo].[SocialNetwork] ([name], [url]) VALUES (N'Facebook', N'fb.png')
INSERT [dbo].[SocialNetwork] ([name], [url]) VALUES (N'Twitter', N'tw.png')
INSERT [dbo].[SocialNetwork] ([name], [url]) VALUES (N'Google+', N'gg.png')
INSERT [dbo].[View] ([View]) VALUES (10479)
