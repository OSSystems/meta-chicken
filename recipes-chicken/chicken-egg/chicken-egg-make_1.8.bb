SECTION = "devel/chicken"
DESCRIPTION = "The PLT 'make' macro"
LICENSE = "LGPL-2.0+"
LIC_FILES_CHKSUM = "file://make.meta;md5=5800c0bc95d44d1c7c515da5509c8e90"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/make/make-${PV}.tar.gz"

SRC_URI[md5sum] = "89f1a75eb1118ec2de633a749e0fc9f3"
SRC_URI[sha256sum] = "5cedd9aa79a291fe78095ae4a3e776939978233e4025af62b2a7db1383e50201"

S = "${WORKDIR}/make-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
