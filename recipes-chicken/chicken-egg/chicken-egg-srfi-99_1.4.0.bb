SECTION = "devel/chicken"
DESCRIPTION = "SRFI-99 record types"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-99.meta;md5=a9319bc455905331cb6dc21a03533b45"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "ebddd879f2837cd41a064203397ea1c5"
SRC_URI[sha256sum] = "a3a94d959a6192a7971f6637bd0c439ed586c3ddd988cecd36055219954c014f"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
