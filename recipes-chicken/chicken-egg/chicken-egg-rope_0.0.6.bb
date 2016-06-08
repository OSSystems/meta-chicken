SECTION = "devel/chicken"
DESCRIPTION = "Heavyweight alternative to strings"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://rope.meta;md5=7df0484e0a05898387666c23ce8bf99f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/rope/rope-${PV}.tar.gz"

SRC_URI[md5sum] = "ae78c6257216f4e8fad5a3af9c458ebe"
SRC_URI[sha256sum] = "78b9867badaa9a8ab74ebeee62a99fee8a90544048c30f2e4a89f5cf279f5d39"

S = "${WORKDIR}/rope-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
