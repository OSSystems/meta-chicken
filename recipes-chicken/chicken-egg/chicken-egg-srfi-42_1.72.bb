SECTION = "devel/chicken"
DESCRIPTION = "SRFI-42 (Eager comprehensions)"
LICENSE = "SRFI"
LIC_FILES_CHKSUM = "file://srfi-42.meta;md5=ca2ecbe8464898ce609aade8afd31aec"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "639ec8f60c09359e6afdb3ef91278e90"
SRC_URI[sha256sum] = "8537f59654f1a40968b5cebe7bb8d4827a793e8e34b6ce67d311993146ed8451"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
