SECTION = "devel/chicken"
DESCRIPTION = "A fast and simple SHA1 implementation with minimal dependencies"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://simple-sha1.meta;md5=5cb3ab517d8a2a51b0278b4f74bc7525"

inherit chicken_install

BBCLASSEXTEND = "cross"
