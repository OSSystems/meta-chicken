SECTION = "devel/chicken"
DESCRIPTION = "The PLT 'make' macro"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://make.meta;md5=0506d579d40548dba3bd0c53144c2465"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/make/make-${PV}.tar.gz"

SRC_URI[md5sum] = "95a5fd5c7ec5ddc9f840b939c2fb7459"
SRC_URI[sha256sum] = "6152562920b65774a36be9bb7e39a1e7f71b16760e1ff70c276db4f7bc285c95"

S = "${WORKDIR}/make-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
