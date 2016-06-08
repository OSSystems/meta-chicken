SECTION = "devel/chicken"
DESCRIPTION = "Composable macros based on the CK abstract machine"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://ck-macros.meta;md5=4bfdd0039a663fd85b11183ec3c6dedd"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ck-macros/ck-macros-${PV}.tar.gz"

SRC_URI[md5sum] = "129d8c61c4b15eccfedf02973480dbf6"
SRC_URI[sha256sum] = "de40b31ae145f06138a9a03d2cf2fd68227ff4f2bf835e3f06220afb4a0b6712"

S = "${WORKDIR}/ck-macros-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
