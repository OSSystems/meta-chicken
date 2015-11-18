SECTION = "devel/chicken"
DESCRIPTION = "Exports strings corresponding to standard XML (XHTML, HTML) doctypes"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://doctype.meta;md5=403ffd964bdb237e83842f2206670a85"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/doctype/doctype-${PV}.tar.gz"

SRC_URI[md5sum] = "fea27020e1edf266925e16f742f97605"
SRC_URI[sha256sum] = "fdebf6bbc53eafb9581a3bcfedba6d479b9d8a87e19ddb506faa58980e06b1bf"

S = "${WORKDIR}/doctype-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
