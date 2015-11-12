SECTION = "devel/chicken"
DESCRIPTION = "Convenient shell-command invocation"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://shell.meta;md5=b46b0c98bf4e3ef6cd80bb1db01f893e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/shell/shell-${PV}.tar.gz"

SRC_URI[md5sum] = "ea1ce9d1654766d05b358c2f8ee8f8e9"
SRC_URI[sha256sum] = "b11dc64734eabbe8b653ee7a1a397e8718a3fa609dd79d41a5902a5556f89775"

S = "${WORKDIR}/shell-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
