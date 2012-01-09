inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Sending a file over the network"
DEPENDS_virtclass-cross += "chicken-cross"
DEPENDS += "chicken"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sendfile.meta;md5=bb98b66d854a8b5f3444b911dd86f55a"
